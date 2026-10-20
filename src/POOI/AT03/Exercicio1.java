package AtividadesMarcelo.AT03;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] vetor = new String[5];

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Insira uma cidade: ");
            vetor[i] = input.next();
        }
        System.out.println("Cidades do vetor: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
