package Estrutura_de_Repetição;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Informe o numero que deseja calcular a tabuada:"); //pede o numero ao usuario
        int numero= scan.nextInt(); //guarada o numero fornecido na variavel

        for(int i= 1; i<=10; i++){ //repete ate i= 10
            System.out.println(numero + " X " + i + " = " + (i*numero)); //calcula e imprime a tabuada do numero
        }

        scan.close();
    }
}
