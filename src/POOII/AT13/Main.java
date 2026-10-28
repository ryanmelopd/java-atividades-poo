package POOII.AT13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ContaBancaria conta1 = null;
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("=== SISTEMA BANCÁRIO");
                System.out.print("Insira o nome do titular: ");
                String titular = input.nextLine();

                System.out.print("Insira o seu saldo: ");
                String saldoString = input.nextLine();
                double saldo = Double.parseDouble(saldoString);

                conta1 = new ContaBancaria(titular, saldo);

                System.out.print("Insira o valor para sacar: R$");
                double valorDeSaque = input.nextDouble();

                conta1.sacar(valorDeSaque);
                continuar = false;
            } catch (NumberFormatException e) {
                System.out.println("O campo de saldo não pode conter letras.");
            } catch (IllegalArgumentException e) {
                System.out.println("O campo de titular não pode conter números.");
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            } finally {
                if (conta1 != null) {
                    conta1.exibirDados();
                }
                input.close();
            }
        }
    }
}
