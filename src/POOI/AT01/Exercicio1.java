package AtividadesMarcelo.AT01;
public class Exercicio1 {
    public static void main(String []args) {
        mostrarProduto("cereal",10.99,10);
    }
    public static void mostrarProduto(String nome, double preco, int quantidade) {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor do produto: " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
