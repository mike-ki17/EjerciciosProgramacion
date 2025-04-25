
package ventanasjava;
import javax.swing.JOptionPane;

public class Opciones {
    public static void main(String[] args) {
       int opcion;
       do{
           String menu = "Menu principal\n\n"
                       + "1. Mensaje de Confirmación \n"
                       + "2. Entrada de usuario \n"
                       + "3. Mensaje \n"
                       + "4. Salida \n"
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
                      Confirmacion.main(args);
                      break;
               case 2:
                      EntradaUsuario.main(args);
                      break;             
               case 3:
                      Mensaje.main(args);
                      break;
               case 4:
                   System.exit(0);
                   break;
               default: 
                      JOptionPane.showMessageDialog(null, "Opcion no valida");
           }
       }while(true);
    }
    
}
