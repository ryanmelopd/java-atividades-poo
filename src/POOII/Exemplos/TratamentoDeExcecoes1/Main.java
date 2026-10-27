package POOII.Exemplos.TratamentoDeExcecoes1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Informe o numerador da divisão: ");
            int a = input.nextInt();
            System.out.print("Informe o denominador da divisão: ");
            int b = input.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por zero. " +
                    "\nErro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Não é possível informar textos. " +
                    "\nErro: " + e.getMessage());
        } finally {
            System.out.println("Encerrando o programa...");
            input.close();
        }
    }
}
