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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase ");
        String frase= leer.nextLine();
       
        if (verifica(frase) ) {
        System.out.println("la frase ingresada es CORRECTA " );
                                        
            
        } else   {
                System.out.println("la frase ingresada es INCORRECTA " );
                
                }
        
        
        
    }
    public static boolean verifica(String frase ) {
        return frase.equalsIgnoreCase("EUREKA");
    }
 }
    

