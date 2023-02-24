/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeAprendizaje;
import java.util.Scanner;
/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 * @author gateway
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int retorno = sumar(num1 ,num2);
        System.out.println("La suma  de los nuumeros ingresados es : " + retorno );
       
        
    }
    
    public static int sumar (int num1, int num2){
        int suma = num1+num2;
                return suma;
    
    }
}
