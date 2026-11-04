package POOII.AT17;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> clientes = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            System.out.print("Informe o nome do cliente " + i + ": ");
            clientes.add(input.nextLine());
        }

        System.out.println("Cliente no indíce 2: " + clientes.get(2));

        System.out.print("Informe o nome do novo cliente: ");
        clientes.set(2, input.nextLine());

        System.out.println("\nNome de todos os clientes:");
        for (String cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("\nTamanho da lista de clientes: " + clientes.size());
    }
}
