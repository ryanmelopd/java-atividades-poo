package POOII.AT11;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String placa, String modelo, double valorBaseDiaria, int quantidadePortas) {
        super(placa, modelo, valorBaseDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public double calcularDiaria() {
        return getValorBaseDiaria() + 50.00;
    }

    @Override
    public void exibirDados() {
        System.out.println("\n=== CARRO ===");
        super.exibirDados();
        System.out.println("Portas: " + quantidadePortas);
        System.out.println("Locação por 3 dias: " + calcularLocacao(3));
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o carro " + getModelo() + "...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro " + getModelo() + "...");
    }
}
