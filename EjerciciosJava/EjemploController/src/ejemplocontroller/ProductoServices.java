

package ejemplocontroller;
import java.util.ArrayList;
import java.util.List;


public class ProductoServices {
    private List<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(String nombre, double precio) {
        if (nombre == null || nombre.isEmpty() || precio <= 0) {
            System.out.println("Error: Datos inválidos para el producto.");
            return;
        }
        productos.add(new Producto(nombre, precio));
        System.out.println("Producto agregado: " + nombre);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("📢 No hay productos registrados.");
            return;
        }
        System.out.println("📋 Lista de Productos:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }   
}


