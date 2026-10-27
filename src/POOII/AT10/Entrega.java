package POOII.AT10;

public abstract class Entrega implements Rastreavel {
    private String codigo;
    private double distanciaKm;

    public Entrega(String codigo, double distanciaKm) {
        this.codigo = codigo;
        this.distanciaKm = distanciaKm;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Distância em km: " + distanciaKm);
    }

    public abstract double calcularFrete();

    @Override
    public void rastrear() {
        System.out.println("Rastreando entrega de código " + codigo + ".");
    }
}
