package AT04.Exercicio1;

// Exercício 1
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome,double preco,int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void apresentarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}
