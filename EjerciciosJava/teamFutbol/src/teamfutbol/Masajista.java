
package teamfutbol;

import java.util.Scanner;

public class Masajista extends Persona{
    
    String titulacion;
    int aniosExperiencia;
    
    public Masajista () {}
    
    public Masajista (String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
    }
    
    public void datosMasajista (Scanner input) {
        System.out.println("--- Ingresa los datos del masajista ---");
        super.datosPersona(input);
        
        System.out.print("Ingresa la titulacion: ");
        this.titulacion = input.next();
        
        System.out.print("Ingresa los años de experienia: ");
        this.aniosExperiencia = input.nextInt();
    }
    
    
    public String infoMasajista () {
        String message;
               message = ("--- Datos del masajista --- \n"
                       + super.infoPersona()
                       + "Titulacion: " + titulacion + "\n"
                       + "Años de experiencia: " + aniosExperiencia + "\n") ;
        
        return message;
    }
}
