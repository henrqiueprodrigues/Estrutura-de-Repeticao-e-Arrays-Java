package Estrutura_de_Repetição;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Digite a sua  nota:");
        double nota= scan.nextDouble(); //guarda o valor digitada pelo usuario, usa double para guardar notas quebradas

        while (nota<0 | nota>10){
            System.out.println("Nota invalida, por favor digite um valor entre 0 e 10:");
            nota= scan.nextDouble();
        }
        System.out.println("Nota registrada");
        scan.close();
    }
}
