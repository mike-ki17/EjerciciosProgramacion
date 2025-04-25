
package teamfutbol;

import java.util.Scanner;

public class Persona {
    
    int id;
    String nombre;
    String apellidos;
    int edad;
    
    public Persona () {}
    
    public Persona (int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public void datosPersona (Scanner input) {
        System.out.print("Ingrese el id: ");
        this.id = input.nextInt();
        
        System.out.print("Ingresa el nombre: ");
        this.nombre = input.next();
        
        input.useDelimiter("\n");
        System.out.print("Ingresa los apellidos: ");
        this.apellidos = input.next();
        input.reset();
        
        System.out.print("Ingresa la edad: ");
        this.edad = input.nextInt();
    }
    
    public String infoPersona () {
        String message;
               message = ("Id: " + String.valueOf(id) + "\n"
                       + "Nombre: " + nombre + "\n"
                       + "Apellidos: " + apellidos + "\n"
                       + "Edad. " + String.valueOf(edad) + "\n"
                    );
        return message;
    }
}
