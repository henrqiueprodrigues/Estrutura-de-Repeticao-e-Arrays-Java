package Estrutura_de_Repetição;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int resultadoFatorial= 1; //variavel que sera usada para calcular o fatorial
        System.out.println("Qual fatorial deseja calcular?:"); //pede o numero ao usuario
        int numero= scan.nextInt(); //guarda o numero digitado pelo usuario e o utiliza como limite do laço de reptição

        for(int i=1; i<=numero; i++){
            resultadoFatorial *= i; //faz o calculo do fatorial
        }

        System.out.println(numero + "!= " + resultadoFatorial); //Imprime o resultado
        scan.close();
    }
}
