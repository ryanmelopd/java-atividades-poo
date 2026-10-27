package POOII.AT10;

public class EntregaBicicleta extends Entrega {
    private double precoPorKm;

    public EntregaBicicleta(String codigo, double distanciaKm, double precoPorKm) {
        super(codigo, distanciaKm);
        this.precoPorKm = precoPorKm;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Preço por km: " + precoPorKm);
    }

    @Override
    public double calcularFrete() {
        return super.getDistanciaKm() * precoPorKm;
    }

    @Override
    public void rastrear() {
        super.rastrear();
    }
}
