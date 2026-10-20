package AT02;

public class EntregaLocal extends Entrega {
    private final double freteFixo = 10;

    public EntregaLocal(String codigoPedido) {
        super(codigoPedido);
    }

    @Override
    public double calcularValorFrete() {
        return freteFixo;
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
    }
}
