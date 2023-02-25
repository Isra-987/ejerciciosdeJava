/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeAprendizaje;

import java.util.Scanner;

/**
 *
 * @author gateway
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).
        */ 
        int n;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar el tamaño del vector a crear:");
        n = leer.nextInt();        
        int[] vector = new int[n];
        
        rellenar(vector, n, leer);
        imprimir(vector, n);
        buscar(vector, n, leer);
        //int numero = (int) (Math.random() * 11);
        //System.out.println(numero);
    }
    public static int[] rellenar(int[] vector, int n, Scanner leer){
        for (int i = 0; i < n; i++){
            System.out.println("Ingresar el número #" + (i+1) + " del vector:");
            vector[i] = leer.nextInt();
        }
        return vector;
    }
    public static void imprimir(int[] vector, int n){
        for (int i = 0; i < n; i++){
            if (i != n -1){
                System.out.print(vector[i] + "| ");
            } else {
                System.out.println(vector[i]);
            }
        }
}
    public static void buscar(int[] vector, int n, Scanner leer){
        int cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        for (int i = 0; i < n; i++){
            if (vector[i] < 10){
                cont1++;
            } else if (vector[i] < 100){
                cont2++;
            } else if (vector[i] < 1000){
                cont3++;
            } else if (vector[i] < 10000){
                cont4++;
            } else if (vector[i] < 100000){
                cont5++;
            }
        }
        System.out.println("Se encontraron " + cont1 + " números de 1 dígito, " + cont2 + " números de 2 dígitos, " + cont3 + " números de 3 dígitos, " + cont4 + " números de 4 dígitos y " + cont5 + " números de 5 dígitos.");
    
    }
    
}
