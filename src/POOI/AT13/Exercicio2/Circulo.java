package POOI.AT13.Exercicio2;

public class Circulo extends Forma {
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    @Override
    public void apresentarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raio: " + raio);
    }

}
