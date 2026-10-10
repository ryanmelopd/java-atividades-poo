package Exemplos.ExemploAssociacaoSimples;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Sérgio",123456);
        Curso curso = new Curso("Engenharia de Software",3200);

        System.out.println("Dados do aluno:");
        aluno.apresentarDados();

        aluno.matricularAluno(curso);
        System.out.println("Dados do aluno pós matrícula:");
        aluno.apresentarDados();
    }
}
