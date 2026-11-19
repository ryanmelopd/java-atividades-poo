package POOII.AvFinal;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Catalogo<Curso> cursos = new Catalogo<>();
        int quantidadeGeral = 0;

        while (quantidadeGeral < 3) {
            try {
                System.out.println("\n=== Cadastro de Curso ===");
                System.out.print("Modalidade (Presencial/EAD): ");
                String modalidade = input.nextLine().trim().toLowerCase();

                System.out.print("Nome: ");
                String nome = input.nextLine();

                System.out.print("Carga horária: ");
                int cargaHoraria = input.nextInt();

                System.out.print("Nível (BASICO/AVANCADO): ");
                String nivelTexto = input.next().trim().toUpperCase();
                input.nextLine();

                Nivel nivel;
                try {
                    nivel = Nivel.valueOf(nivelTexto);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Nível inválido! Digite BASICO ou AVANCADO.");
                }

                Curso curso;

                switch (modalidade) {
                    case "presencial":
                        curso = new CursoPresencial(nome, cargaHoraria, nivel);
                        break;

                    case "ead":
                        curso = new CursoEAD(nome, cargaHoraria, nivel);
                        break;

                    default:
                        throw new IllegalArgumentException("Tipo inválido! Digite presencial ou ead.");
                }

                cursos.adicionar(curso);
                quantidadeGeral++;
                System.out.println("Curso cadastrado com sucesso!");

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente!");
            }
        }

        System.out.println("=== Cursos Cadastrados ===");
        for (Curso curso : cursos.getElementos()) {
            curso.exibirDados();
            curso.iniciar();
            System.out.println();
        }

        List<String> nomeCursosAvancados = cursos.getElementos()
                .stream()
                .filter(curso -> curso.getNivel() == Nivel.AVANCADO)
                .map(Curso::getNome)
                .toList();

        System.out.println("\n=== Cursos do nível avançado ===");
        if (nomeCursosAvancados.isEmpty()) {
            System.out.println("Não existe nenhum curso no nível avançado.");
        } else {
            nomeCursosAvancados.forEach(curso -> System.out.println("Nome: " + curso));
        }

        System.out.println("\n=== Total de cursos ===");
        int quantidadeEAD = Math.toIntExact(cursos.getElementos()
                .stream()
                .filter(curso -> curso instanceof CursoEAD)
                .count());

        int quantidadePresencial = Math.toIntExact(cursos.getElementos()
                .stream()
                .filter(curso -> curso instanceof CursoPresencial)
                .count());

        System.out.println("Quantidade geral: " + quantidadeGeral);
        System.out.println("Quantidade de cursos EAD: " + quantidadeEAD);
        System.out.println("Quantidade de cursos presenciais: " + quantidadePresencial);

        input.close();
    }
}
