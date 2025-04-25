
package calculadoraapp;

import javax.swing.JOptionPane;

public class Restar{
    public static void main(String[] args){
        
        Operaciones resta = (a, b) -> a - b;
        
        float[] datos = Utils.PedirDatos("resta");
                
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resta.operar(datos[0], datos[1]) );
    } 
}
