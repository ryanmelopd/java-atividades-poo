package AtividadesMarcelo.AT03;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[8];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um número: ");
            vetor[i] = input.nextInt();
        }

        int maiorNumero = vetor[0];
        int menorNumero = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
            }
            if (vetor[i] < menorNumero) {
                menorNumero = vetor[i];
            }
        }
        System.out.println("Maior número do vetor: " + maiorNumero);
        System.out.println("Menor número do vetor: " + menorNumero);
    }
}
