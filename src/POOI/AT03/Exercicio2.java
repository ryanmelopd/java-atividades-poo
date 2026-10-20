package POOI.AT03;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] vetor = new int[6];
    int soma = 0;

    for(int i = 0; i < vetor.length; i++) {
        System.out.print("Insira um número inteiro: ");
        vetor[i] = input.nextInt();
        soma += vetor[i];
        }
    System.out.println("Soma de todos os valores: " + soma);
    }
}
