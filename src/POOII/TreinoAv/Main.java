package POOII.TreinoAv;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadastro<Animal> cadastro = new Cadastro<>();
        int quantidade = 0;

        while (quantidade < 3) {
            try {
                System.out.println("\nCadastro de Animal:");
                System.out.print("Tipo (cachorro/gato): ");
                String tipo = scanner.nextLine().trim().toLowerCase();

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Porte (PEQUENO/GRANDE): ");
                String porteTexto = scanner.nextLine().trim().toUpperCase();

                Porte porte;
                try {
                    porte = Porte.valueOf(porteTexto);
                } catch (IllegalArgumentException e) {
                    throw new IllegalArgumentException("Porte inválido! Digite PEQUENO ou GRANDE.");
                }

                Animal animal;

                switch (tipo) {
                    case "cachorro":
                        animal = new Cachorro(nome, porte);
                        break;

                    case "gato":
                        animal = new Gato(nome, porte);
                        break;

                    default:
                        throw new IllegalArgumentException("Tipo inválido! Digite cachorro ou gato.");
                }

                cadastro.adicionar(animal);
                quantidade++;
                System.out.println("Animal cadastrado com sucesso!");

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Tente novamente!");
            }
        }
        System.out.println("\nAnimais Cadastrados:");
        for (Animal animal : cadastro.getElementos()) {
            animal.exibirDados();
            animal.emitirSom();
            System.out.println();
        }

        List<String> animaisPequenos = cadastro.getElementos()
                .stream()
                .filter(animal -> animal.getPorte() == Porte.PEQUENO)
                .map(Animal::getNome)
                .toList();

        System.out.println("\nAnimais de Porte Pequeno:");
        System.out.println(animaisPequenos);
        long totalCachorros = cadastro.getElementos()
                .stream()
                .filter(animal -> animal instanceof Cachorro)
                .count();

        long totalGatos = cadastro.getElementos()
                .stream()
                .filter(animal -> animal instanceof Gato)
                .count();

        System.out.println("\nTotal de Animais:");
        System.out.println("Cachorros: " + totalCachorros);
        System.out.println("Gatos: " + totalGatos);

        scanner.close();
    }
}
