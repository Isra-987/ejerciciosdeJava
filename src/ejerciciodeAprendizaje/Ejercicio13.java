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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de lados deseado");
        int numLados = leer.nextInt();
        figura(numLados);
        
    }
    public static void figura(int numLados) {
        
        for (int i = 0; i < numLados; i++) {
            for (int j = 0; j < numLados; j++) {
                if(i==0 || j==0 || i==(numLados-1) || j==(numLados-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
    
}
