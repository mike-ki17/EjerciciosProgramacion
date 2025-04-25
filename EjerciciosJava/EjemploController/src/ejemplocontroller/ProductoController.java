
package ejemplocontroller;


public class ProductoController {
    private final ProductoServices productoService;

    public ProductoController() {
        this.productoService = new ProductoServices();
    }

    public void agregarProducto(String nombre, double precio) {
        productoService.agregarProducto(nombre, precio);
    }

    public void listarProductos() {
        productoService.listarProductos();
    }
}


