
package teamfutbol;

import java.util.Scanner;

public class Entrenador extends Persona{
    
    String idFederacion;
    
    public Entrenador () {}
    
    public Entrenador (String idFederacion, int id, String nombre, String apellidos, int edad){
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    public void datosEntrenador (Scanner input) {
        System.out.println("--- Ingresa los datos del entrenador ---");
        super.datosPersona(input);
        
        System.out.print("Ingresa la federacion: ");
        idFederacion = input.next();
    }
    
    public String infoEntrenador () {
        String message;
               message = ("--- Datos del entrenador --- \n"
                       + super.infoPersona()
                       + "Federacion: " + idFederacion + "\n");
        
        return message;
    }
    
    
}
