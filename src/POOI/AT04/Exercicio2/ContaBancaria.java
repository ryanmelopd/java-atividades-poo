package POOI.AT04.Exercicio2;

public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Valor depositado.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado.");
        } else {
            System.out.println("Erro: saldo insuficiente..");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Seu saldo: R$" + saldo);
    }
}
