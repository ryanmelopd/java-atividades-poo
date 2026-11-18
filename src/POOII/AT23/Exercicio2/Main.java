package POOII.AT23.Exercicio2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos =  List.of(new Aluno[]{
                new Aluno("Ana", 8.5),
                new Aluno("Bruno", 6.0),
                new Aluno("Carlos", 7.0),
                new Aluno("Diana", 9.0),
                new Aluno("Eduardo", 4.5)
        });

        System.out.println("Alunos aprovados:");
        List<String> alunosAprovados = alunos
                .stream()
                .filter(aluno -> aluno.getNota() >= 7.0)
                .map(Aluno::getNome)
                .toList();

        alunosAprovados.forEach(aluno -> System.out.println("Parabéns " + aluno + "! Você foi aprovado."));
    }
}
