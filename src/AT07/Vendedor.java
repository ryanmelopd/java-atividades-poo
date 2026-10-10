package AT07;

public class Vendedor extends Funcionario {
    private double valorVendas;
    private double percentual;

    public Vendedor(String nome, long matricula, double salarioBase, double valorVendas, double percentual) {
        super(nome, matricula, salarioBase);
        this.valorVendas = valorVendas;
        this.percentual = percentual;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("O percentual de comissão deve estar entre 0 e 100.");
        }
        this.percentual = percentual;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0) {
            throw new IllegalArgumentException("O valor das vendas não pode ser negativo.");
        }
        this.valorVendas = valorVendas;
    }

    @Override
    public double calcularSalario() {
        double comissao = valorVendas * percentual / 100;
        return getSalarioBase() + comissao;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.printf("Valor de vendas: R$ %.2f%n" , valorVendas);
        System.out.println("Percentual: %" + percentual);
        double salarioFinal = calcularSalario();
        System.out.printf("Salário final: R$ %.2f%n" , salarioFinal);
    }

    public void registrarVenda() {
        System.out.println("O vendedor registrou uma venda.");
    }

}
