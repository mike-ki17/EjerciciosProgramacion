
package ejercicioherencia;
import java.util.Scanner;

public class Persona {
    
    protected double codigo;
    protected String nombre;
    protected String apellidos;
    
    public Persona () {}
    
    public Persona (double codigo, String nombre, String apellidos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public void datosPersona (Scanner input) {
        System.out.print("Ingresa el nombre: ");
        this.nombre = input.next();
        
        input.useDelimiter("\n");
        System.out.print("Ingresa los apellidos: ");
        this.apellidos = input.next();
        input.reset();
        
        System.out.print("Ingresa el codigo: ");
        this.codigo = input.nextDouble();
    }
    
    public String infoPersona () {
        String message;
        message = ("Nombre: " + this.nombre + "\n"
                + "Apellidos: " + this.apellidos + "\n"
                );
        return message;
    }    
}
