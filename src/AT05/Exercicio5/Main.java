package AT05.Exercicio5;

public class Main {
    public static void main(String[] args) {
        ItemEstoque item = new ItemEstoque("Mouse",0,95.9);

        item.adicionarQuantidade(25);
        item.retirarQuantidade(10);
        item.mostrarEstoque();
    }
}
