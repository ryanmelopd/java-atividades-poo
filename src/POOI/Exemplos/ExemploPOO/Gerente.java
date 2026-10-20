package POOI.Exemplos.ExemploPOO;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe");
    }

}
