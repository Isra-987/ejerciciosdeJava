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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double euros;
        int moneda;
        System.out.println("Ingresar la cantidad de euros:");
        
        euros = leer.nextDouble();
        System.out.println("A que tipo de moneda desea realizar el cambio?");
        System.out.println("Opcion 1: Libras");
        System.out.println("Opcion 2: Dolares");
        System.out.println("Opcion 3: Yenes");
        moneda = leer.nextInt();
        
        tasa_cambio(euros, moneda);
    }
    public static void tasa_cambio(double euros, int moneda){
        double result;
        double[] vector = new double[3];
        vector[0] = 0.86; //Libras
        vector[1] = 1.28611; //DÃ³lares
        vector[2] = 129.852; //Yenes
        
        switch (moneda){
            case 1:
                result = euros * vector[0];
                System.out.println("La conversion de los " + euros + " euros a libras es: " + result);
                break;
            case 2:
                result = euros * vector[1];
                System.out.println("La conversion de los " + euros + " euros a dolares es: " + result);
                break;
            case 3:
                result = euros * vector[2];
                System.out.println("La conversion de los " + euros + " euros a yenes es: " + result);
                break;
            default:
                System.out.println("Opcion no valida");
        }
        return;

    }
    
}
