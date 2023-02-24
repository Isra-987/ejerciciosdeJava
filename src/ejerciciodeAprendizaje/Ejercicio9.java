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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase o palabra");
        frase = leer.nextLine();
        System.out.println("Inicia con "+ frase.charAt(0));
        if(frase.charAt(0)=='A'){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }

    }
    
}
