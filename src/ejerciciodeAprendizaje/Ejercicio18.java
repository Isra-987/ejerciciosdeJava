/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodeAprendizaje;


/**
 *
 * @author gateway
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
       traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
       cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] vector  = new int[4][4];
        int[][] vector2 = new int[4][4];
        rellenar(vector);
        traspuesta(vector,vector2);
        imprimir(vector);   
        
    }
    
    public static int[][] rellenar(int[][] vector){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                vector[i][j] = (int) (Math.random() * 10);;
            }
        }
        return vector ;
    }

    
    public static void imprimir(int[][] vector ){
          for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; i++){
                if (j != 3){
                    System.out.print(vector[i][j] + "| ");
                }   else {
                    System.out.println(vector[i][j]);
                }
            }
        }
    }
    
    public static int traspuesta(int [][] vector,int [][] vector2){
        
     
       for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                vector2[i][j]= vector[j][i]; 
            }
        }
        return vector2 [][];
    }
}

