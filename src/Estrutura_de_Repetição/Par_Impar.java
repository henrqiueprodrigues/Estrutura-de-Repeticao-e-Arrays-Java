package Estrutura_de_Repetição;

import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int quantidadePar= 0; //guarda a quantidade de pares
        int quantidadeImpar= 0; //guarda a quantidade de impares
        int numero,quantidadeNumeros; //guarda os numeros digitados e a quantidade de numeros que devem ser coletados

        System.out.println("quantios numeros deseja inserir?:"); // pede quantos numeros o usuario deseja inserir
        quantidadeNumeros= scan.nextInt(); //guarda a quantidade de numero que desja inserir

        for(int i=0; i<quantidadeNumeros;i++){ //executa o laço ate coletar a quantidade de numeros especificado pelo usuario
            System.out.println("Insira o " + (i+1) + " numero:"); //pede o numero ao usuario
            numero= scan.nextInt(); //guarda o nuemro fornecido
            if(numero%2 == 0){ //se o numero for par ele adicio 1 ao quantidaePar, caso contrario ele adicio 1 a quantidadeImpar
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }
        }

        System.out.println("Quantidade de impares: " + quantidadeImpar); //mostra a quantodade de pares
        System.out.println("Quantidade de pares: " + quantidadePar); //mostra a quantidade de impares
        scan.close();
    }
}
