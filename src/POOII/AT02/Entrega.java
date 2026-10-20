package AT02;

public abstract class Entrega {
    protected String codigoPedido;

    public Entrega(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public abstract double calcularValorFrete();

    public void exibirResumo() {
        double valorFrete = calcularValorFrete();
        System.out.println("Código do pedido: " + codigoPedido);
        System.out.println("Valor do frete: " + valorFrete);
    }
}

