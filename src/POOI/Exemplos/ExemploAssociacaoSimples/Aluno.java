package Exemplos.ExemploAssociacaoSimples;

public class Aluno {
    private String nome;
    private long matricula;
    private Curso curso;

    public Aluno(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void apresentarDados(){
        System.out.println("Aluno: " + nome);
        System.out.println("Matrículoa: " + matricula);

        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
            System.out.println("Carga horária: " + curso.getCargaHoraria());
        } else {
            System.out.println("Aluno não está matriculado.");
        }
    }

    public void matricularAluno(Curso curso) {
            if (curso != null) {
                this.curso = curso;
                System.out.println("O aluno foi matrículado no curso.");
            }
    }

}
