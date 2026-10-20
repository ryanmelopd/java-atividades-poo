package Exemplos.Polimorfismo;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ser vazio.");
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("Erro: o salário base não pode ser negativo.");
            this.salarioBase = 0;
        }
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getTipo() {
        return "Funcionário";
    }

    public void apresentarDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nome: " + nome);
        System.out.printf("Salário base: R$ %.2f%n" ,salarioBase);
        System.out.printf("Salário final: R$ %.2f%n" ,calcularSalario());
    }

}
