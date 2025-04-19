use sumerca;

CREATE TABLE notificaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    mensaje TEXT,
    fecha datetime
);

DELIMITER $$

CREATE PROCEDURE notificar_clientes_inactivos()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE cid INT;
    DECLARE cname VARCHAR(100);

    DECLARE cur CURSOR FOR
        SELECT cedula FROM clientes;

    DECLARE CONTINUE HANDLER 
    FOR NOT FOUND SET done = 1;

    OPEN cur;

    leer_clientes: LOOP
        FETCH cur INTO cid;
        IF done THEN
            LEAVE leer_clientes;
        END IF;

        -- Revisamos si NO tiene compras en los últimos 60 días
        IF NOT EXISTS (
            SELECT 1 FROM factura
            WHERE idCliente = cid
            AND fechaVenta >= CURDATE() - INTERVAL 60 DAY
        ) THEN
            INSERT INTO notificaciones (id_cliente, mensaje)
            VALUES 
            (cid, CONCAT('Hola te extrañamos en Sumerca. 
            Hace tiempo que no realizas compras.'));
        END IF;

    END LOOP;

    CLOSE cur;
END$$

DELIMITER ;


CALL notificar_clientes_inactivos();

select * from notificaciones;



