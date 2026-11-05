package POOII.AT19;

public class Main {
    public static void main(String[] args) {
        Caixa<String> nome = new Caixa<>("Caderno");
        Caixa<Integer> quantidade = new Caixa<>(10);
        Caixa<Double> preco = new Caixa<>(25.50);

        System.out.println("Informações:");
        System.out.println("Nome: " + nome.obter());
        System.out.println("Quantidade: " + quantidade.obter());
        System.out.println("Preço: " + preco.obter());
    }
}
