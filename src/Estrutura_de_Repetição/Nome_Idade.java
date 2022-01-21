package Estrutura_de_Repetição;

import java.util.Scanner;

public class Nome_Idade {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in); //inicializa o scaner

        while (true){
            System.out.println("Digite o seu nome:"); //pede o nome para o usuario
            String nome= scan.next(); //guarda o nome digitado pelo usuario na variavel

            if(nome.equals("0"))break; //sai do laço de repetição caso o nome seja 0

            System.out.println("digite a sua idade:"); //pede a idade ao usuario
            int idade= scan.nextInt(); //guarda a idade na variavel

        }
        scan.close();//para o scaner

    }
}
