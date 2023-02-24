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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limite = 0, num, suma=0;
        System.out.println("¿Cual es el límite?");
        limite = leer.nextInt();
        do{
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            suma=suma+num;
        }while(suma<limite);
        System.out.println("La suma es:"+suma);

        
    }
    
}
