package AT07;

public abstract class Funcionario implements Registravel {
    private String nome;
    private int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

    public abstract double calcularSalario();

    @Override
    public void registrarPresenca() {
        System.out.println("Presença confirmada!");
    }
}
