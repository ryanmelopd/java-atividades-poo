package POOI.AT12;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        nome = nome.trim();
        System.out.println("Nome sem espaço nas extremidades: " + nome);
        System.out.println("Nome em letras maiscúlas: " + nome.toUpperCase());
        System.out.println("Quantidade de letras: " + nome.length());
        System.out.println("O nome contém espaços entre as palavras: " + nome.contains(" "));
        System.out.println("Foi digitado um nome completo: " + nome.contains(" "));
        input.close();
    }
}
