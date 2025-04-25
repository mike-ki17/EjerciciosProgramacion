
package ventanasjava;
import javax.swing.JOptionPane;
public class EntradaUsuario {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        JOptionPane.showMessageDialog(null, "El nombre ingresado fue: " + nombre);
    }
    
}
