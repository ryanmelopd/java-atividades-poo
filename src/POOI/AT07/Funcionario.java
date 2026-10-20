package POOI.AT07;

public class Funcionario {
    private String nome;
    private long matricula;
    private double salarioBase;

    public Funcionario(String nome, long matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("A matrícula deve ser maior que zero.");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ficar vazio.");
        }
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("O salário-base deve ser maior que zero.");
        }
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário base: R$ %.2f%n" , salarioBase);
    }

}
