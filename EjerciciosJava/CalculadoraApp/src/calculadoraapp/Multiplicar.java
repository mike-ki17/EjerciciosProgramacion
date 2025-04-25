
package calculadoraapp;

import javax.swing.JOptionPane;

public class Multiplicar {
    public static void main(String[] args){
        
        Operaciones multiplicar = (a, b) -> a * b;
        
        float[] datos = Utils.PedirDatos("multiplicacion");
                
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " + multiplicar.operar(datos[0], datos[1]) );
    } 
}
