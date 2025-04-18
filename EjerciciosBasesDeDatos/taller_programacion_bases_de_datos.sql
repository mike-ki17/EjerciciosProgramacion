-- Taller Programación de base de datos corte II 

-- Michael Yesid Castro Daza

-- 1.
-- Escribe un procedimiento que no tenga ningún parámetro de entrada ni de salida y
-- que muestre el texto ¡Hola mundo!

delimiter //
create procedure hola ()
begin
	select "Hola Mundo !";
end
//
delimiter ;

call hola();

-- 2. 
-- Escribe un procedimiento que reciba un número real de entrada, que representa el
-- valor de la nota de un alumno, y muestre un mensaje indicando qué nota ha
-- obtenido teniendo en cuenta las siguientes condiciones:
-- [0,5) = Insuficiente
-- [5,6) = Aprobado
-- [6, 7) = Bien
-- [7, 9) = Notable
-- [9, 10] = Sobresaliente
-- En cualquier otro caso la nota no será válida.

delimiter //
create procedure vaidar_calificacion_cuantitativa (in calificacion int, out calificacion_cualitativa varchar(16))
begin 
	select
    case 
		when calificacion between 0 and 5 then "Insuficiente"
        when calificacion > 5 and calificacion <= 6 then "Aprobado"
        when calificacion > 6 and calificacion <= 7 then "Bien"
        when calificacion between 8 and 9 then "Notable"
        when calificacion > 9 and calificacion <= 10 then "Sobresaliente"
        else "Calificación no valida"
	end into calificacion_cualitativa;
end //
delimiter ;

call vaidar_calificacion_cuantitativa(10, @resultado);
select concat("Resultado: ",  @resultado);

-- 3. 
-- Escriba un procedimiento llamado cantidadProductos que reciba como entrada el
-- nombre del tipo de producto y devuelva el número de productos que existen dentro
-- de esa categoría.


delimiter //
create procedure cantidadProductos (in tipoProducto varchar(45), out numeroProductos int)
begin 
	select count(p.idProducto) into numeroProductos
	from productos p
	join tipoproductos t on t.idTipoProducto = p.idTipoProducto
	where t.nombreTipoProducto = tipoProducto;
end //
delimiter ;


call cantidadProductos("Lácteos", @numeroProductos);
select concat("Existen: ", @numeroProductos, " Productos lácteos");


-- 4. 
-- Escribe un procedimiento que se llame preciosProductos, que reciba como
-- parámetro de entrada el nombre del tipo de producto y devuelva como salida tres
-- parámetros. El precio máximo, el precio mínimo y la media de los productos que
-- existen en esa categoría.

delimiter //
create procedure preciosProductos 
(
	in tipoProducto varchar(45), 
    out precioMax int,
    out precioMin int,
    out mediaPrecio int
)
begin
	select 
    max(valorVenta),
    min(valorVenta), 
    floor(avg(valorVenta))
    into precioMax, precioMin, mediaPrecio
	from  productos p
	join tipoproductos t on t.idTipoProducto = p.idTipoProducto
	where t.nombreTipoProducto = tipoProducto;
end //

delimiter ;

call preciosProductos("Lácteos", @precioMax, @precioMin, @mediaPrecio);
select concat("Precios Lácteos: Precio mayor: ", @precioMax, " Precio menor: ", @precioMin, "Promedio de precio: ", @mediaPrecio)


-- 5.
-- Realice un procedimiento que se llame funcionIVA que incluya una función que
-- calcule el total con el incremento del iva.

delimiter //
create function funcionIva (total_sin_iva int)
returns int 
deterministic
begin 
	SET @tasa_iva = 0.19;
    return total_sin_iva * (1 + @tasa_iva);
end //

delimiter ;

select concat("El valor de la venta sin iva es: ", valorVenta, " Y con iva es; ", funcionIva(valorVenta), "$ COP") as aplicarFuncionIva
from factura
where numeroFactura = 1;


-- 6. 
-- Escribe un procedimiento que reciba el nombre de un país como parámetro de
-- entrada y realice una consulta sobre la tabla sucursal para obtener todos las
-- sucursales que existen en la tabla de ese país.


delimiter //
create procedure contarSucursales(in nombreCiudad varchar(50), out numeroSucursales int)
begin
	select count(ciudad) into numeroSucursales 
    from sucursal
	where ciudad = nombreCiudad
	group by ciudad;
end //

delimiter ;

select concat("En Bogota hay: ", @numeroSucursales, " sucursales");
	


-- 7. 
-- Una vez creada la tabla se decide añadir una nueva columna a la tabla llamada edad
-- que será un valor calculado a partir de la columna fecha_nacimiento. Escriba la
-- sentencia SQL necesaria para modificar la tabla y añadir la nueva columna.


alter table Usuarios add column edad int;

set sql_safe_updates = 0;
update Usuarios set edad = TIMESTAMPDIFF(YEAR, fechaNacimiento, CURDATE());
set sql_safe_updates = 1;

select * from Usuarios;


-- 8. 
-- Escriba una función llamada calcularEdad que reciba una fecha y devuelva el
-- número de años que han pasado desde la fecha actual hasta la fecha pasada como
-- parámetro

delimiter //
create function calcularEdad (fecha date)
returns int
deterministic

begin 
	declare anios int;
	set anios = year(fecha);

    return year(curdate()) - anios;
end //
delimiter ;

select concat("El usuario: ", nombre, " tiene: ", calcularEdad(fechaNacimiento), " años") 
as edades 
from Usuarios


-- 9. 
-- Escriba un procedimiento que permita calcular la edad de todos los usuarios que ya
-- existen en la tabla. Para esto será necesario crear un procedimiento llamado
-- actualizarColumnaEdad que calcule la edad de cada usuario y actualice la tabla.
-- Este procedimiento hará uso de la función calcularEdad que hemos creado en el
-- paso anterior.

delimiter //
create procedure actualizarColumnaEdad ()
begin 
	set sql_safe_updates = 0;
	update Usuarios 
    set edad = calcularEdad(fechaNacimiento);
    set sql_safe_updates = 1;
end //
delimiter ;
	
call actualizarColumnaEdad();
select edad from Usuarios;


