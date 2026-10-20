package POOI.AT09;

import java.util.Scanner;

public class AnaliseDeNotasDeUmaTurma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[6];

        mostrarCabecalho();
        preencherNotas(input, notas);

        double media = calcularMedia(notas);
        int aprovados = contarAprovados(notas);
        int reprovados = notas.length - aprovados;

        mostrarNotas(notas);
        System.out.printf("%nMédia da turma: %.2f%n", media);
        System.out.println("Alunos aprovados: " + aprovados);
        System.out.println("Alunos reprovados: " + reprovados);
        input.close();
    }

    public static void mostrarCabecalho() {
        System.out.println("=== ANÁLISE DAS NOTAS DA TURMA ===");
        System.out.println("----------------------------------");
    }

    public static void preencherNotas(Scanner input, double[] notas) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }

    public static int contarAprovados(double[] notas) {
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6.0) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public static void mostrarNotas(double[] notas) {
        System.out.println("\nNotas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Aluno %d: %.2f%n", (i + 1), notas[i]);
        }
    }
}
