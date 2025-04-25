
package teamfutbol;

import java.util.Scanner;

public class TeamFutbol {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
            
        boolean loop = true;
        while (loop) {
            System.out.println("¿ Quires añadir a un mienbro del equipo de futbol ?");
            String menu = ("[1] para Futbolista \n[2] para Entrenador \n[3] para Masajista \n[4] Finalizar programa");
            System.out.println(menu);
            System.out.print("Digita: ");
            int option = input.nextInt();        

            switch (option){
                
                case 1:
                    System.out.println("Genial vas a registrar un futbolista");
                    Futbolista futbolista = new Futbolista();
                    futbolista.datosFutbolista(input);
                    String datosDelFutbolista = futbolista.infoFutbolista();
                    System.out.println(datosDelFutbolista);
                    break;
                case 2:
                    System.out.println("Genial vas a registrar un entrenador");
                    Entrenador entrenador = new Entrenador();
                    entrenador.datosEntrenador(input);
                    String datosDelEntrenador = entrenador.infoEntrenador();
                    System.out.println(datosDelEntrenador);
                    break;
                case 3:
                    System.out.println("Genial vas a registrar un masajista");
                    Masajista masajista = new Masajista();
                    masajista.datosMasajista(input);
                    String datosDelMasajista = masajista.infoMasajista();
                    System.out.println(datosDelMasajista);
                    break;
                default:
                    System.out.println("======= Fin ========");
                    loop = false;
                    break;
            }
            
        }
    }
    
}
