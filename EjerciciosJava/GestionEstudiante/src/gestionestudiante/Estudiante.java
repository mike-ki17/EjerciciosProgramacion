
package gestionestudiante;
import java.util.Scanner;
public class Estudiante {
    protected String nombre;
    protected double n1, n2, n3;
    
    public Estudiante () {}
    
    public Estudiante(String nombre, double n1, double n2, double n3) {
        this.nombre = nombre;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
   
    public void capturar_notas (Scanner teclado) {
        
        n1 = capturarNota(teclado, "Ingrese la primer nota del estudiante: ");
        n2 = capturarNota(teclado, "Ingrese la segunda nota del estudiante: ");
        n3 = capturarNota(teclado, "Ingrese la tercera nota del estudiante: ");

    }
    
    private double capturarNota(Scanner teclado, String mensaje) {
    double nota;
    do {
        System.out.print(mensaje);
        nota = teclado.nextDouble();
        if (nota < 0.0 || nota > 5.0) {
            System.out.println("Error: La nota debe estar entre 0.0 y 5.0. Intente nuevamente.");
        }
    } while (nota < 0.0 || nota > 5.0);
    return nota;
}

    
    public double calcular_nota_final () {
        return Math.round(((n1 + n2 + n3) / 3) * 100.0) / 100.0;
    }
    
    public double getNotaFinal() {
        return calcular_nota_final();
    }
}
