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
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase= leer.nextLine();
        if (esMayuscula(frase) ) {
        System.out.println("la frase ingresada en minuscula es " + frase.toLowerCase());
                                        
            
        } else   {
                System.out.println("la frase ingresada en mayuscula es " + frase.toUpperCase());
                
                }
        
        

    }
    public static boolean esMayuscula(String frase ) {
        return frase.equals(frase.toUpperCase());
    }
}
