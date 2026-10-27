package POOII.AT11;

public abstract class Veiculo implements Operavel {
    private final String placa;
    private String modelo;
    private double valorBaseDiaria;
    private static int totalVeiculos = 0;
    public static final String NOME_LOCADORA = "Locadora Central Presa";

    public Veiculo(String placa, String modelo, double valorBaseDiaria) {
        if (valorBaseDiaria <= 0) {
            throw new IllegalArgumentException("O valor-base da diária deve ser maior que zero.");
        }
        this.placa = placa;
        this.modelo = modelo;
        this.valorBaseDiaria = valorBaseDiaria;
        totalVeiculos++;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorBaseDiaria() {
        return valorBaseDiaria;
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorBaseDiaria(double valorBaseDiaria) {
        if (valorBaseDiaria <= 0) {
            throw new IllegalArgumentException("O valor-base da diária deve ser maior que zero.");
        }
        this.valorBaseDiaria = valorBaseDiaria;
    }

    public abstract double calcularDiaria();

    public void exibirDados() {
        System.out.println("Locadora: " + NOME_LOCADORA);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.printf("Valor da diária: R$ %.2f%n", calcularDiaria());
    }

    public double calcularLocacao(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
        return calcularDiaria() * dias;
    }
}
