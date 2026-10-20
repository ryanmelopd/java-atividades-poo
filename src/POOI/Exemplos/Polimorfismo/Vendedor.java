package Exemplos.Polimorfismo;

public class Vendedor extends Funcionario {
    private double valorVenda;
    private double percentualComissao;

    public Vendedor(String nome, double salarioBase, double valorVenda, double percentualComissao) {
        super(nome, salarioBase);
        setValorVenda(valorVenda);
        setPercentualComissao(percentualComissao);
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        if (valorVenda >= 0) {
            this.valorVenda = valorVenda;
        } else {
            System.out.println("Erro: o valor de venda não pode ser negativo.");
            this.valorVenda = 0;
        }
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao >= 0) {
            this.percentualComissao = percentualComissao;
        } else {
            System.out.println("Erro: o percentual de comissão não pode ser negativo.");
            this.percentualComissao = 0;
        }
    }

    @Override
    public double calcularSalario() {
        double comissao = valorVenda * percentualComissao / 100;
        return getSalarioBase() + comissao;
    }

    @Override
    public String getTipo() {
        return "Vendedor";
    }

}
