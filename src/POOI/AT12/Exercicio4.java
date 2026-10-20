package POOI.AT12;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome do arquivo: ");
        String arquivo = input.nextLine();

        arquivo = arquivo.trim();

        if (arquivo.isEmpty()) {
            System.out.println("O nome do arquivo está vazio.");
        } else {
            arquivo = arquivo.toLowerCase();
            if (arquivo.endsWith(".pdf")) {
                System.out.println("O arquivo possui a extensão .pdf.");
                String nomeArquivo = arquivo.substring(0, arquivo.length() - 4);
                nomeArquivo = nomeArquivo.replace(" ", "_");
                System.out.println("Nome do arquivo: " + arquivo);
                System.out.println("Nome sem extensão: " + nomeArquivo);
            } else {
                System.out.println("O arquivo não possui a extensão .pdf.");
            }
        }
        input.close();
    }
}