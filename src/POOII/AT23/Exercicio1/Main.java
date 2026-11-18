package POOII.AT23.Exercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(new Produto[]{
                new Produto("Caderno", 25),
                new Produto("Mochila", 150),
                new Produto("Caneta", 5),
                new Produto("Teclado", 100),
                new Produto("Monitor", 800)
        });

        System.out.println("Preço e nome dos produtos:");
        produtos.forEach(produto -> {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
        });

        System.out.println("\nProdutos com preço menor ou igual a 100:");
        List<String> nomesProdutos = produtos
                .stream()
                .filter(produto -> produto.getPreco() <= 100)
                .map(Produto::getNome)
                .toList();

        nomesProdutos.forEach(produto -> System.out.println("Produto: " + produto));
    }
}
