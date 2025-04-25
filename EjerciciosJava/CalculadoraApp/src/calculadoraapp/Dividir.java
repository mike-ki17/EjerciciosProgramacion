
package calculadoraapp;

import javax.swing.JOptionPane;

public class Dividir {
    public static void main(String[] args){
        
        Operaciones dividir = (a, b) -> a / b;
        
        float[] datos = Utils.PedirDatos("division");
        
         if (datos[1] != 0 ){
              JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + dividir.operar(datos[0], datos[1]) );
              
         }
         else {
              JOptionPane.showMessageDialog(null, "No puedes dividir sobre 0, vuelvelo a intentar");
         }
           
    } 
}
