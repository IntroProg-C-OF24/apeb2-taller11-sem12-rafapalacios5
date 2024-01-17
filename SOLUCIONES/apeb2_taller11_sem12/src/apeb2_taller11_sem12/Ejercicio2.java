/*
Generar una solución que implemente 3 procedimientos que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. 
Cada procedimiento/función debe recibir los datos necesarios y generar el valor correspondiente. Se debe invocar a los procedimientos desde un método principal; 
Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado. 
 */
package apeb2_taller11_sem12;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int areas;
        double lado, base, altura;
        double areaTriangulo, areaRectangulo;
        System.out.println("Ingrese 1 para calcular el área del cuadrado ");
        System.out.println("Ingrese 2 para calcular el área del triángulo");
        System.out.println("Ingrese 3 para calcular el área del rectángulo");
        areas = tcl.nextInt();
        switch (areas) {
            case 1:
                System.out.println("Ingrese un lado de la figura");
                lado = tcl.nextDouble();
                System.out.println("El área del Cuadrado es: " + obtenerAreaCuadrado(lado));
                break;
            case 2:
                System.out.println("Ingrese la base de la figura");
                base = tcl.nextDouble();
                System.out.println("Ingrese la altura de la figura");
                altura = tcl.nextDouble();
                areaTriangulo = obtenerAreaTriangulo(base, altura);
                System.out.println("El área del triángulo es: " + areaTriangulo);
                break;
            case 3:
                System.out.println("Ingrese la base de la figura");
                base = tcl.nextDouble();
                System.out.println("Ingrese la altura de la figura");
                altura = tcl.nextDouble();
                areaRectangulo = obtenerAreaRectangulo(base, altura);
                System.out.println("El área del triángulo es: " + areaRectangulo);
                break;
        }        
    }
    
    public static double obtenerAreaCuadrado(double lad){
        double areaCuadrado=0;
        areaCuadrado= Math.pow(lad, 2);
        return areaCuadrado;
    }
    
    public static double obtenerAreaTriangulo(double b, double h){
        double areaTriangulo=0;
        areaTriangulo= (b*h)/2;
        return areaTriangulo;
    }
    
    public static double obtenerAreaRectangulo(double b, double h){
        double areaRectangulo=0;
        areaRectangulo= b*h;
        return areaRectangulo;
    }
}
