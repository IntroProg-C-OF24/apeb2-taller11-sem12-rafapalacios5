/*
Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. 
Si el promedio es: De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. 
A la función se la debe llamar desde un método principal. Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 */
package apeb2_taller11_sem12;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double nota1,nota2,nota3,nota4, promedio;
        System.out.println("Ingrese sus notas" );
        nota1 = tcl.nextDouble();
        nota2 = tcl.nextDouble();
        nota3 = tcl.nextDouble();
        nota4 = tcl.nextDouble();
        promedio= promedioNotas(nota1, nota2, nota3, nota4);
        System.out.println("Su promedio es: " + promedio);
        System.out.println("Su promedio cualitativo es: " + promedioCualitativo(promedio));
    }
    
    public static double promedioNotas (double nota1,double nota2,double nota3,double nota4) {
        double sumaNotas = 0, promedio;
        sumaNotas= nota1+nota2+nota3+nota4;
        promedio=sumaNotas/4;
        return promedio;
    }
    
    public static String promedioCualitativo(double promedio){
        String calificacion= "";
        if(promedio >= 0 && promedio <= 5)
            calificacion="Regular"; 
        else 
            if(promedio >= 5.1 && promedio <= 8)
                calificacion="Bueno"; 
            else
                if (promedio >= 8.1 && promedio <= 9)
                    calificacion="Muy Bueno"; 
                else
                    if (promedio >= 9.1 && promedio <= 10)
                    calificacion="Sobre Saliente"; 
        return calificacion;
    }    
}
