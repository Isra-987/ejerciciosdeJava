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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido
         */
        int n;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar el tamaño del vector a crear:");
        n = leer.nextInt();
        int[] vector = new int[n];

        rellenar(vector, n);
        imprimir(vector, n);
        buscar(vector, n, leer);
        //int numero = (int) (Math.random() * 11);
        //System.out.println(numero);
    }

    public static int[] rellenar(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        return vector;
    }

    public static void imprimir(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(vector[i] + "| ");
            } else {
                System.out.println(vector[i]);
            }

        }
    }

    public static void buscar(int[] vector, int n, Scanner leer) {
        int num, j = 0;
        int[] vector2 = new int[n];
        System.out.println("Ingresar un número a buscar en el vector:");
        num = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                vector2[j] = i;
                j++;
            }
        }
        if (j > 1) {
            System.out.print("El número se encontró en el índice " + vector2[0] + " del vector y se encontró repetido en los índices ");
            for (int i = 1; i < j; i++) {
                if (i != j - 1) {
                    System.out.print(vector2[i] + ", ");
                } else {
                    System.out.println("y " + vector2[i]);
                }

            }
        } else if (j == 1) {
            System.out.println("El número se encontró en el índice " + vector2[0]);
        } else {
            System.out.println("No se encontró el número en el vector");
        }
    }

}
