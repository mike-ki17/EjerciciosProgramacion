
package teamfutbol;

import java.util.Scanner;

public class Futbolista extends Persona{
    
    int dorsal;
    String demarcacion;
    
    public Futbolista () {}
    
    public Futbolista (int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }    
    
    public void datosFutbolista (Scanner input) {
        System.out.println("--- Ingresa los datos del futbolista ---");
        super.datosPersona(input);
        
        System.out.print("Ingresa la dorsal: ");
        dorsal = input.nextInt();
        
        System.out.print("Ingresa la demarcacion: ");
        demarcacion = input.next();
    }
    
    public String infoFutbolista () {
        String message;
               message = ("--- Datos del futbolista --- \n" 
                       + super.infoPersona()
                       + "Dorsal: " + dorsal + "\n"
                       + "Demarcacion: " + demarcacion + "\n"
                    );
        return message;
    }
    
}
