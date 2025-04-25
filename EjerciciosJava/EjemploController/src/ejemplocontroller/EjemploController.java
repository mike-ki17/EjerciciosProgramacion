
package ejemplocontroller;
import java.util.Scanner;
public class EjemploController {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoController controlador = new ProductoController();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n📌 Menú:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Listar Productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese precio del producto: ");
                    double precio = scanner.nextDouble();
                    controlador.agregarProducto(nombre, precio);
                    break;
                case 2:
                    controlador.listarProductos();
                    break;
                case 3:
                    System.out.println("👋 Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("⚠ Opción inválida.");
            }
        }
    
    }
    
}
