package Arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String[] letras= new  String[6]; //cria um vetor do tipo string com 6 valores
        int quantidadeConsoantes=0; //variavel para guardar a quantide de consoantes

        for(int i= 0; i<letras.length; i++){
            System.out.println("Digite uma letra:"); //pede uma letra ao usuario
            letras[i]= scan.next(); //prenche o array com a letra fornceida

            if( verificaConsoante(letras[i])){ //passa o valor do array na posição i para verifiacar se é uma consoante
            } else { //caso nao seja uma vogal ela é uma consoante, incrementa o contador
                quantidadeConsoantes++;
            }
        }
        System.out.println("Consoantes:");
        for (int i=0; i< letras.length; i++){
            if(!verificaConsoante(letras[i])){ //caso retorne falso (ou seja a letra é uma consoante), imprime o valor da posição
                System.out.println("letras[" + i + "] = " + letras[i]);
            }
        }
        System.out.println("Quantidade de consoante= " + quantidadeConsoantes); //imprime a quantidade de consoantes
        scan.close();
    }

    //função para verificar se a letra é uma consoante, compara com as vogais, caso não seja nenhuma delas retorna falso
    public static boolean verificaConsoante(String letra){
        return letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u");
    }
}
