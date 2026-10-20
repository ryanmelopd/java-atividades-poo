package POOI.AT14;

import java.util.Scanner;

public class ControleDeNotasDosAlunos {
    static Scanner input = new Scanner(System.in);
    static String[] nomes = new String[5];
    static double[] notas = new double[5];

    public static void main(String[] args) {
        cadastrarAlunos();
        apresentarAlunos();

        System.out.printf("%nMédia da turma: %.2f%n", calcularMedia());
        System.out.printf("Maior nota: %.2f%n", encontrarMaiorNota());
        System.out.printf("Menor nota: %.2f%n", encontrarMenorNota());

        System.out.println("\n--- Situação dos alunos ---");
        for (int i = 0; i < nomes.length; i++) {
            apresentarSituacao(nomes[i], notas[i]);
        }

        System.out.print("\nDigite o nome do aluno que deseja buscar: ");
        String nomeProcurado = input.nextLine();
        int posicao = buscarAluno(nomeProcurado);
        if (posicao != -1) {
            System.out.println("Aluno encontrado na posição: " + posicao);
            apresentarSituacao(nomes[posicao], notas[posicao]);
        } else {
            System.out.println("Aluno não cadastrado.");
        }
        input.close();
    }

    public static void cadastrarAlunos() {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("\nAluno " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();
            System.out.print("Nota: ");
            notas[i] = Double.parseDouble(input.nextLine());
        }
    }

    public static void apresentarAlunos() {
        System.out.println("\n--- Alunos cadastrados ---");
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%s - Nota: %.2f%n", nomes[i], notas[i]);
        }
    }

    public static double calcularMedia() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static double encontrarMaiorNota() {
        double maior = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        return maior;
    }

    public static double encontrarMenorNota() {
        double menor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }

    public static int buscarAluno(String nomeProcurado) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                return i;
            }
        }
        return -1;
    }

    public static void apresentarSituacao(String nome, double nota) {
        String situacao;
        if (nota >= 6.0) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }
        System.out.printf("%s - Nota: %.2f - %s%n", nome, nota, situacao);
    }
}