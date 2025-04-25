
package ventanasjava;
import javax.swing.JOptionPane;

public class Confirmacion {
    public static void main(String[] args) {
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea continuar? ", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(null, "Cool! continua con el proceso");
        }
        else{
           JOptionPane.showMessageDialog(null, "No Cool! No continua con el proceso");
        }
        
    }
    
}
