package POOII.AT11;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, double valorBaseDiaria, int cilindradas) {
        super(placa, modelo, valorBaseDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() + 20.00;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n=== MOTO ===");
        super.exibirDados();
        System.out.println("Cilindradas: " + cilindradas);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando a moto " + getModelo() + "...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a moto " + getModelo() + "...");
    }
}
