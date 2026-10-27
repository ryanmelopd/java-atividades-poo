package POOII.AT10;

public class EntregaCaminhao extends Entrega {
    private double precoPorKm;
    private double taxaFixa;

    public EntregaCaminhao(String codigo, double distanciaKm, double precoPorKm, double taxaFixa) {
        super(codigo, distanciaKm);
        this.precoPorKm = precoPorKm;
        this.taxaFixa = taxaFixa;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Preço por km: " + precoPorKm);
        System.out.println("Taxa fixa: " + taxaFixa);
    }

    @Override
    public double calcularFrete() {
        return (super.getDistanciaKm() * precoPorKm) + taxaFixa;
    }

    @Override
    public void rastrear() {
        super.rastrear();
    }
}
