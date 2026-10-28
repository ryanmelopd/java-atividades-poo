package POOII.AT12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();
        System.out.print("Insira sua idade: ");
        String texto = input.nextLine();

        try {
            int idade = Integer.parseInt(texto);
            Aluno aluno1 = new Aluno(nome, idade);
            aluno1.exibirDados();
        } catch (NumberFormatException e) {
            System.out.println("\nIdade inválida! Digite um número inteiro.");
        } finally {
            System.out.println("\nTentativa de cadastro finalizada.");
        }
    }
}
