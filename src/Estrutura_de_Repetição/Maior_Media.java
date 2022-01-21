package Estrutura_de_Repetição;

import java.util.Scanner;

public class Maior_Media {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in); //inicia o scaner

        double mediaNumeros = 0; //variaveis que guarda o numero
        int maiorNumero,nunero; //variaveis que guarda o maior numero e os inputs do usuario
        maiorNumero = -999; //inicializa o maior  numero como negativo, há casos de erro caso o usuario so insira valores menores

        for (int i=0; i<5; i++){ //laço de repetição para coletar 5 numeros
            System.out.println("Digite o " + (i+1) + " numero:"); //pede o numero ao usuario
            nunero= scan.nextInt(); //guarad o nunmero digitado pelo usuario
            mediaNumeros +=nunero; //adiciona o  numero a media para ser calculada posteriormente
            if (nunero>maiorNumero)maiorNumero=nunero; //verifica se o numero digitado é o  maior, caso seja o numero se rtorna o maior

        }

        System.out.println("Média é = " + mediaNumeros/5); //calcula e imprime a média
        System.out.println("O maior numero é = " + maiorNumero); //imprime o maior nunmero
        scan.close(); //fecha o scaner
    }
}
