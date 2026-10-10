package AT07;

public class Gerente extends Funcionario {
    private double valorBonus;

    public Gerente(String nome, long matricula, double salarioBase, double valorBonus) {
        super(nome, matricula, salarioBase);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus < 0) {
            throw new IllegalArgumentException("O valor do bônus não pode ser negativo."
            );}
        this.valorBonus = valorBonus;
    }

    @Override
    public double calcularSalario() {
        return valorBonus + getSalarioBase();
    }

    public void realizarReuniao() {
        System.out.println("O gerente está realizando uma reunião.");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.printf("Valor bônus: R$ %.2f%n" , valorBonus);
        double salarioFinal = calcularSalario();
        System.out.printf("Salário final: R$ %.2f%n" , salarioFinal);
    }

}
