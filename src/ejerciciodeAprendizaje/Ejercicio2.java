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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
       pantalla.
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
          System.out.println("ingresa tu nombre  ");
          String nombre = leer.nextLine();
          printP( nombre);
          

        

    }
          public static void printP (String nombre){
              System.out.println("el nombre que ingresaste es " + nombre );
          }   
        
}
