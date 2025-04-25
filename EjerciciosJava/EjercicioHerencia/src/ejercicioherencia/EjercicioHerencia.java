
package ejercicioherencia;
import java.util.Scanner;
public class EjercicioHerencia {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        while (loop){
            
            System.out.println("¿ Quieres ingresar un empleado o un alumno ?");
            System.out.println("Para detener el programa digita [3]");
            System.out.print("Digita [1] para empleado, [2] para estudiante: ");
            
            int tipoPersona = input.nextInt();
            switch (tipoPersona){
                case 1: 
                    System.out.println("Genial vas a crear un empleado");
                    Empleados empleado = new Empleados();
                    empleado.datosEmpleado(input);
                    String datosDelEmpleado = empleado.infoEmpleado();
                    System.out.println(datosDelEmpleado);
                    break;
                case 2: 
                    System.out.println("Genial vas a crear un estudiante");
                    Estudiante estudiante = new Estudiante();
                    estudiante.datosEstudiante(input);
                    String datosDelEstudiante = estudiante.infoEstudiante();
                    System.out.println(datosDelEstudiante);
                    break;
                default: loop = false;
            }
            
            
        }
        
    }
    
}
