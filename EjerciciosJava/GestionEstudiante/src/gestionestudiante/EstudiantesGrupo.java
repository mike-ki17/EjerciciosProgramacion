
package gestionestudiante;
import java.util.Scanner;

class EstudiantesGrupo extends Estudiante {
    private Estudiante[] estudiantes;
    String nombreCarrera;
    int edad;    

    
    public EstudiantesGrupo(int cantidad) {
        estudiantes = new Estudiante[cantidad]; 
    }
    
    
    public void capturar_datos_estudiante (Scanner teclado){
        
         for (int i = 0; i < estudiantes.length; i++) {
            teclado.useDelimiter("\n");
            System.out.println("====================================");
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = teclado.next();
            teclado.reset(); 
            
            System.out.print("Ingrese el nombre de la carrera del estudiante " + nombre + ": ");
            nombreCarrera = teclado.next();
            teclado.reset(); 
            
            System.out.print("Ingrese la edad del estudiante " + nombre + ": ");
            while (!teclado.hasNextInt()) {
                System.out.print("Error: Debe ingresar un número entero.");
                teclado.next();
            }
            edad = teclado.nextInt();
     
            super.capturar_notas(teclado);

            estudiantes[i] = new Estudiante(nombre, n1, n2, n3);
        }
        
       
        
    }
    
    public double calcular_promedio_final_grupo() {
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNotaFinal();
        }
        return suma / estudiantes.length;
    }
    
    public void mostrar_resultados() {
        System.out.println("\n===== Resultados del Grupo =====");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("La nota final del estudiante " + estudiante.nombre + " es: " + estudiante.getNotaFinal());
        }
        System.out.println("Promedio del grupo: " + calcular_promedio_final_grupo());
    }
    
}
