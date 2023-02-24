/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeAprendizaje;

/**
 *
 * @author gateway
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
    Realizar un algoritmo que rellene un vector con los 100 primeros numeros enteros y los
    muestre por pantalla en orden descendente.
         */
        int[] vector = new int[100];
        crear_vector(vector);
        imprimir_vector(vector);
    }

    public static int[] crear_vector(int[] vector) {
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        return vector;
    }

    public static void imprimir_vector(int[] vector) {
        for (int i = 99; i > -1; i--) {
            System.out.print(vector[i] + "| ");
        }
    }
}
