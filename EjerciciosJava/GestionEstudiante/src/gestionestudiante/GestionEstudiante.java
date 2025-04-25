
package gestionestudiante;

import java.util.Scanner;


public class GestionEstudiante {

    
    public static void main(String[] args) {
        

        Scanner teclado= new Scanner(System.in);
        
       
        int cantidad = 2;
        EstudiantesGrupo grupo = new EstudiantesGrupo(cantidad);

        grupo.capturar_datos_estudiante(teclado);
        grupo.mostrar_resultados();
    }
    
}
