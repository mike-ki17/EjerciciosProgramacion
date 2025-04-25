
package ejercicioherencia;

import java.util.Scanner;

public class Empleados extends Persona{
    
    String cargo;
    double salario;
    
    public Empleados () {}
    
    public Empleados (String cargo, double salario, double codigo, String nombre, String apellidos){
        super(codigo, nombre, apellidos);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    
    public void datosEmpleado (Scanner input){
        System.out.println("Ingresa los siguientes datos para registrar un empleado");
        super.datosPersona(input);
        
        input.useDelimiter("\n");
        System.out.print("Ingresa el cargo: ");
        this.cargo =  input.next();
        input.reset();
        
        System.out.print("Ingresa el salario: ");
        this.salario = input.nextDouble();
    }
    
    public String infoEmpleado (){
        String message;
               message = (
                " --- Empleado creado con exito --- \n"
                + super.infoPersona()
                + "Cargo: " + this.cargo + "\n"
                + "Salario: " + String.valueOf(this.salario) + "\n"
                );
       return message;
    }
}
