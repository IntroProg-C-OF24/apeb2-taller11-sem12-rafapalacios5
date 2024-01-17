/*
Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional.
 */
package apeb2_taller11_sem12;
public class Ejercicio1 {
    public static void main(String[] args) {
        int limF=4, limC=4;
        int matriz [][]= new int [limF][limC];
        double promedio; 
        generarMatriz(matriz, limF, limC);   
        System.out.println("La matriz generada es: \n" + devolverMatriz(matriz, limF, limC));
        promedio=calculoPromedioPares(matriz, limF, limC);
        System.out.println("El promedio de los pares de la matriz es: \n" + promedio);
    }
    
    public static void generarMatriz (int matriz [][], int limF, int limC){
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                matriz[i][j] = (int)(Math.random()*(9-1+1)+1);  
            }     
        }
    }
    
    public static String devolverMatriz (int matriz [][], int limF, int limC){
        String cadena="";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                cadena += String.format("%d\t" , matriz[i][j]); 
            }
            cadena += "\n"; 
        }
        return cadena;
    }
    
    public static double calculoPromedioPares(int matriz [][], int limF, int limC) {
        double cantidadPares = 0;
        double sumaPares = 0;
        double promedio=0;
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) {
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                    cantidadPares++;
                }
                promedio=sumaPares/cantidadPares;  
            }
        }
        return promedio;
    }    
}
