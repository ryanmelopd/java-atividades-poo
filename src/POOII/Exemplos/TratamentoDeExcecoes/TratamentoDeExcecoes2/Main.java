package POOII.Exemplos.TratamentoDeExcecoes.TratamentoDeExcecoes2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Insira um texto: ");
            String texto = input.nextLine();

            int valor = Integer.parseInt(texto);
            System.out.println("Valor: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Não foi possível a conversão. " +
                    "\nErro: " + e.getMessage());
        } finally {
            System.out.println("Tentativa de conversão encerrada.");
        }
    }
}
