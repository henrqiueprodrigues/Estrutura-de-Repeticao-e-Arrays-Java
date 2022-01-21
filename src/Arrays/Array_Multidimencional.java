package Arrays;

import java.util.Random;

public class Array_Multidimencional {
    public static void main(String[] args) {
        Random random= new Random();

        int[][] matriz= new int[4][4]; //cria uma matriz 4x4

        for(int i=0; i<matriz.length; i++){ //percorre todas as colunas
            for (int b=0; b<matriz.length; b++){ //percorre a linha de cada ccoluna
                matriz[i][b]= random.nextInt(9); //prenche com um valor aleatorio a posição do array
            }
        }

        //imprime o array
        System.out.println("Array com for normal:");
        for(int i=0; i< matriz.length; i++){
            for (int b=0; b< matriz.length; b++){
                System.out.println("matriz[" + (i+1) +"][" + (b+1) + "]= " +matriz[i][b]);
            }
        }

        //imprime o array usando for each
        System.out.println("Array com for each");
        for (int[] linha : matriz){
            for (int coluna: linha ){
                System.out.print(coluna + " | ");
            }
            System.out.println();
        }
    }
}
