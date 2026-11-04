package POOII.AT17;

import java.util.Scanner;

public class Array {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String[] clientes = new String[4];

         for (int i = 0; i < clientes.length; i++) {
             System.out.print("Informe o nome do cliente " + (i + 1) + ": ");
             clientes[i] = input.nextLine();
         }

         System.out.println("Cliente no indíce 2: " + clientes[2]);

         System.out.print("Informe o nome do novo cliente: ");
         clientes[2] = input.nextLine();

         System.out.println("\nNome de todos os clientes: ");
         for (int i = 0; i < clientes.length; i++) {
             System.out.println(clientes[i]);
         }

         System.out.println("\nTamanho da lista de clientes: " + clientes.length);
     }
}

