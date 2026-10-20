package AT07;

public class Professor extends Funcionario {
    private int quantidadeHoras;
    private double valorHora;

    public Professor(String nome, int matricula, int quantidadeHoras, double valorHora) {
        super(nome, matricula);
        this.quantidadeHoras = quantidadeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return quantidadeHoras * valorHora;
    }

    @Override
    public void registrarPresenca() {
        super.registrarPresenca();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
