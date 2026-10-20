package AT07;

public class Secretario extends Funcionario {
    private double salarioMensal;

    public Secretario(String nome, int matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
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
