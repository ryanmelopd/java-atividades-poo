package AT05.Exercicio5;

public class ItemEstoque {
    String nome;
    int quantidade;
    double preco;

    public ItemEstoque(String nome,int quantidade,double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void adicionarQuantidade(int valor) {
        if (valor > 0) {
            this.quantidade += valor;
            System.out.println("Valor adicionado ao estoque.");
        } else {
            System.out.println("Erro: o valor deve ser positivo.");
        }
    }

    public void retirarQuantidade(int valor) {
        if (valor <= quantidade) {
            this.quantidade -= valor;
            System.out.println("Valor removido do estoque");
        } else {
            System.out.println("Erro: o valor deve ser igual ou menor que a quantidade em estoque.");
        }
    }

    public void mostrarEstoque() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Preço do produto: " + preco);
    }
}
