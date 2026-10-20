package POOI.AT06;

public class ReservaHotel {
    private String nome;
    private int numeroQuarto;
    private int quantidadeDiarias;
    private double valorDiaria;

    public ReservaHotel(String nome,int numeroQuarto,int quantidadeDiarias,double valorDiaria) {
        this.nome = nome;
        this.numeroQuarto = numeroQuarto;
        this.quantidadeDiarias = quantidadeDiarias;
        this.valorDiaria = valorDiaria;
    }

    // Getters
    public String getNome() {
        return nome;
    }
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    // Setters com tratamento de exceção para ficar adequado as regras
    public void setNome(String novoNome) {
        if (novoNome == null || novoNome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do hóspede não pode ficar vazio.");
        }
        nome = novoNome;
    }
    public void setNumeroQuarto(int novoNumeroQuarto) {
        if (novoNumeroQuarto <= 0) {
            throw new IllegalArgumentException("O número do quarto deve ser positivo.");
        }
        numeroQuarto = novoNumeroQuarto;
    }
    public void setQuantidadeDiarias(int novaQuantidadeDiarias) {
        if (novaQuantidadeDiarias <= 0) {
            throw new IllegalArgumentException("A quantidade de diárias deve ser maior que zero.");
        }
        quantidadeDiarias = novaQuantidadeDiarias;
    }
    public void setValorDiaria(double novoValorDiaria) {
        if (novoValorDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser maior que zero.");
        }

        valorDiaria = novoValorDiaria;
    }

    // Override
    @Override
    public String toString() {
        return "Nome do hóspede:  " + nome + "\nNúmero do quarto: " + numeroQuarto + "\nQuantidade de diárias: "
                + quantidadeDiarias + "\nValor da diária: " + valorDiaria;
    }

    // Metódos usando tratamento de exceções para se adequar as regras
    public double calcularHospedagem() {
        return quantidadeDiarias * valorDiaria;
    }
    public double calcularHospedagem(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("O desconto deve estar entre 0 e 100.");
        }
        return calcularHospedagem() * (1 - percentualDesconto / 100);
    }
    public double calcularHospedagem(double percentualDesconto,double taxaServico) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("O desconto deve estar entre 0 e 100.");
        }
        if (taxaServico < 0) {
            throw new IllegalArgumentException("A taxa de serviço não pode ser negativa.");
        }
        return calcularHospedagem(percentualDesconto) + taxaServico;
    }
}
