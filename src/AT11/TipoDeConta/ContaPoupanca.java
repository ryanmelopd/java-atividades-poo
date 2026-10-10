package AT11.TipoDeConta;

import AT11.Banco.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, String numeroConta, double saldo, String nomeBanco, double taxaRendimento) {
        super(titular, numeroConta, saldo, nomeBanco);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Taxa de rendimento: " + taxaRendimento);
    }

}
