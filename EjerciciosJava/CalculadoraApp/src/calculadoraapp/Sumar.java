
package calculadoraapp;

import javax.swing.JOptionPane;


public class Sumar{
    public static void main(String[] args){
        
        Operaciones suma = (a, b) -> a + b;
        
        float[] datos = Utils.PedirDatos("suma");
                
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + suma.operar(datos[0], datos[1]) );
    } 
}
