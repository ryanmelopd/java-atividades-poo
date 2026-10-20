package POOI.AT11.Main;

import POOI.AT11.Banco.ContaBancaria;
import POOI.AT11.TipoDeConta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ryan","987654321-00",900.99, "Bradesco");
        ContaPoupanca conta2 = new ContaPoupanca("Marcelo", "0123456789-00", 5990.81, "Santander", 5);

        conta1.apresentarDados();
        conta2.apresentarDados();
    }
}
