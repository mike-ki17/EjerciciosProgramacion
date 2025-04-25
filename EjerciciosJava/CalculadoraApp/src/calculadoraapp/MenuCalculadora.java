
package calculadoraapp;

import javax.swing.JOptionPane;

public class MenuCalculadora {
    public static void main (String[] args) {
        int opcion;
        do {
            String menu = "Operaciones - Calculadora\n\n"
                       + "1. Sumar \n"
                       + "2. Restar \n"
                       + "3. Multiplicar \n"
                       + "4. Dividir \n"
                       + "5. Salir \n" 
                       + " Seleccione la opcion ";
           String input = JOptionPane.showInputDialog(null, menu, "Menu", JOptionPane.QUESTION_MESSAGE);
            if (input == null){
               break;
           }
           try{
               opcion = Integer.parseInt(input);
           }
           catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Ingrese un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
               continue;
           }
           
           switch (opcion){
               case 1:
                      Sumar.main(args);
                      break;
               case 2:
                      Restar.main(args);
                      break;             
               case 3:
                      Multiplicar.main(args);
                      break;
               case 4:
                      Dividir.main(args);
                      break;

               case 5:
                   System.exit(0);
                   break;
               default: 
                      JOptionPane.showMessageDialog(null, "Opcion no valida");
           }
       }while(true);
        
    }
}
