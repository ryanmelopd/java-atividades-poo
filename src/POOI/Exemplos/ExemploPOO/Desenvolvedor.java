package POOI.Exemplos.ExemploPOO;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
    }

    @Override
    public void trabalhar() {
        System.out.println("O desenvolvedor está programando.");
    }

}
