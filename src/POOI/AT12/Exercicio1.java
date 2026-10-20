package POOI.AT12;
 import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = input.nextLine();

        if (palavra.isEmpty()) {
            System.out.println("A palavra não deve ser vazia.");
        } else {
            System.out.println("Palavra digitada: " + palavra);
            System.out.println("Quantidade de caracteres: " + palavra.length());
            System.out.println("Palavra em letras maiscúlas: " + palavra.toUpperCase());
            System.out.println("Palavra em letras minúsculas: " + palavra.toLowerCase());
            System.out.println("Primeira letra da palavra: " + palavra.charAt(0));
            System.out.println("Última letra da palavra: " + palavra.charAt(palavra.length() - 1));
        }
        input.close();
    }
}
