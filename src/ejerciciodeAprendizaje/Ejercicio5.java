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
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num= leer.nextInt();
        int doble = 2*num;
        int triple = 3*num;
        double raizCuadrada = Math.sqrt(num);   
        System.out.println("El doble de " +num + " es "+ doble);
        System.out.println("El triple de " +num + " es "+ triple);
        System.out.println("la raiz cuadrada de " +num + " es "+ raizCuadrada);

        
    }
    
}
