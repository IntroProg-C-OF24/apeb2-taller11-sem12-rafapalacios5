/*
Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. 
Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 */
package apeb2_taller11_sem12;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, cedula;
        int calculos=0;
        double valorInmueble, valorKilowatio, cantKilowatioMes;
        System.out.println("Ingrese Su nombre");
        nombre = tcl.next();
        System.out.println("Ingrese su número de cédula");
        cedula = tcl.next();
        System.out.println("Ingrese 1 para calcular el valor de la planilla de luz ");
        System.out.println("Ingrese 2 para calcular valor del predio de un bien inmueble. ");
        calculos = tcl.nextInt();
        switch (calculos){
            case 1: 
                System.out.println("Ingrese el valor del kilowatio");
                valorKilowatio = tcl.nextDouble();
                System.out.println("Ingrese el número de kilowatios del mes");
                cantKilowatioMes = tcl.nextDouble();
                System.out.println("\nReporte de valor de la Planilla de Luz");
                calcularValorLuz(nombre, cedula, valorKilowatio, cantKilowatioMes);
                break;
            case 2:
                System.out.println("Ingrese el valor del inmueble");
                valorInmueble = tcl.nextDouble();
                System.out.println("\nReporte de valor del inmueble");
                calcularPredio(nombre, cedula, valorInmueble);
                break;    
        }
    }
    
    public static double calcularValorLuz(String nombre, String cedula, double valKilowatio, double cantKilowatio){
        double planillaLuz;
        planillaLuz = valKilowatio *cantKilowatio;
        System.out.println(nombre + " Con cédula: " + cedula + " Debe calcelar el valor de: " + "$" + planillaLuz);
        return planillaLuz;
    }
    
    public static double calcularPredio(String nombre, String cedula, double valorInmueble){
        double inmueble;
        inmueble = valorInmueble*0.02;
        System.out.println(nombre + " Con cédula: " + cedula + " tiene un bien inmueble valorado en: " + "$" + valorInmueble + " y tiene que pagar de predio: " + "$" + inmueble );
        return inmueble;
    }
    
}
