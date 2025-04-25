
package ejercicioherencia;

import java.util.Scanner;

public class Estudiante extends Persona {
    
    String programa;
    int semestre;
    String jornada;
    
    public Estudiante () {}
    
    public Estudiante (String programa, int semestre, String jornada, double codigo, String nombre, String apellidos) {
        super(codigo, nombre, apellidos);
        this.programa = programa;
        this.semestre = semestre;
        this.jornada = jornada;
    }
     
    public void datosEstudiante (Scanner input) {
        System.out.println("Ingresa los siguientes datos para registrar un estudiante");
        super.datosPersona(input);
        
        input.useDelimiter("\n");
        System.out.print("Ingresa el programa: ");
        this.programa = input.next();
        input.reset();
        
        System.out.print("Ingresa el semestre: ");
        this.semestre = input.nextInt();
        
        System.out.print("Ingresa la jornada: ");
        this.jornada = input.next();
    }
    
    public String infoEstudiante (){
        String message;
               message = (
                " --- Empleado creado con exito --- \n"
                + super.infoPersona()
                + "Programa: " + this.programa + "\n"
                + "Semestre: " + this.semestre + "\n"
                + "Jornada: " + this.jornada + "\n"
                );
       return message;
    }
    
}
