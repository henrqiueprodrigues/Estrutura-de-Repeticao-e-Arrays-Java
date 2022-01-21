package Arrays;

import java.util.Random;

public class Numeros_Aleatorios {
    public static void main(String[] args) {
        Random ramdom= new Random();
        int[] inteirosAleatorios= new int[20];

        for ( int i=0; i<inteirosAleatorios.length; i++){ //repete o laço para cada valor dentro do array
            inteirosAleatorios[i]= ramdom.nextInt(100); //adiciona no array um numero aleatorio na posição i
        }

        System.out.println("Numeros aleatorios:"); //imprime cada numero do array
        for ( int numero : inteirosAleatorios){
            System.out.print(numero + " | ");
        }

        System.out.println("\nNumeros Sucessores"); //imprime os sucessores
        for ( int numero : inteirosAleatorios){
            System.out.print(numero+1 + " | ");
        }


    }
}
