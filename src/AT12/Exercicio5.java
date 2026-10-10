package AT12;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome completo: ");
        String nomeCompleto = input.nextLine();

        nomeCompleto = nomeCompleto.trim();

        if (nomeCompleto.isEmpty()) {
            System.out.println("O nome está vazio.");
        } else {
            String[] palavras = nomeCompleto.split("\\s+");

            if (palavras.length < 2) {
                System.out.println("Informe pelo menos um nome e um sobrenome.");
            } else {
                String primeiroNome = palavras[0];
                String ultimoSobrenome = palavras[palavras.length - 1];
                primeiroNome = primeiroNome.toLowerCase();
                ultimoSobrenome = ultimoSobrenome.toLowerCase();
                String usuario = primeiroNome + "." + ultimoSobrenome;
                System.out.println("Nome de usuário: " + usuario);
            }
        }
        input.close();
    }
}