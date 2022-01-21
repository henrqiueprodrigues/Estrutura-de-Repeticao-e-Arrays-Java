package Arrays;

public class Ordem_Inversa {
    public static void main(String[] args) {

        int[] vetor= {12,-85,7,97,72,5}; //cria uma array com numeros "aleatoriso"

        //cria uma variavel dec controle com valor igua a quantidade de elementos do vetor -1 e repete o laço ate q ela chegue em 0
        for(int i= vetor.length-1; i>=0;i--){
            System.out.println("vetor [" + i + "] =" + vetor[i]);
        }
    }
}
