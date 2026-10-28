package POOII.AT13;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) throws IllegalArgumentException {
        if (titular.isBlank()) {
            throw new IllegalArgumentException("O titular não pode ser nulo ou vazio.");
        }
        if (saldo < 0 || Double.isInfinite(saldo)) {
            throw new IllegalArgumentException("O saldo não pode ser negativo ou infinito.");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) throws IllegalArgumentException, SaldoInsuficienteException {
        if (valor < 0 || Double.isInfinite(valor)) {
            throw new IllegalArgumentException("O valor não pode ser negativo ou infinito.");
        }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("O valor não pode ser maior que o saldo.");
        }
        saldo -= valor;
        System.out.println("Valor de R$" + saldo + " sacado da conta.");
    }

    public void exibirDados() {
        System.out.println("=== DADOS ===");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
