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
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la temperatura en grados centigrados ");
        double C =leer.nextDouble();
        System.out.println("temperatura convertida a Fahrenheit es " + convercion(C));
    
    }
    
     public static double convercion(double C){
         double F= 32 + (9* C/5);
         return F;
         
     }
}
