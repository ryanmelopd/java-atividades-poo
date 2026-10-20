package AT12;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String frase = input.nextLine();
        System.out.print("Insira uma palavra que será procurada na frase: ");
        String palavra = input.nextLine();

        frase = frase.toLowerCase();
        palavra = palavra.toLowerCase();
        if (frase.contains(palavra)) {
            System.out.println("A frase contém a palavra buscada.");
            System.out.println("Posição de sua primeira ocorrência: " + frase.indexOf(palavra));
            System.out.println("Posição de sua última ocorrência: " + frase.lastIndexOf(palavra));
        } else {
            System.out.println("A frase não contém a palavra buscada.");
        }
        input.close();
    }
}