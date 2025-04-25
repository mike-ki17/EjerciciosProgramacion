
package calculadoraapp;

import javax.swing.JOptionPane;

public class Utils {
     public static float[] PedirDatos (String operacion) {
        float[] numeros = new float[2];
       boolean datosValidos = false;

        while (!datosValidos) {
            try {
                numeros[0] = Float.parseFloat(JOptionPane.showInputDialog(
                    "Vas a realizar una " + operacion + "\nIngrese el primer número"));

                numeros[1] = Float.parseFloat(JOptionPane.showInputDialog(
                    "Vas a realizar una " + operacion + "\nIngrese el segundo número"));
                datosValidos = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números válidos.");
            }
        }

        return numeros;
    }
    
}
