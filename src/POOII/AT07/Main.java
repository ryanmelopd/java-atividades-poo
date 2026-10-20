package AT07;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Professor("Luís", 77899, 80, 40);
        Funcionario funcionario2 = new Secretario("Fernando", 4653, 2500);

        System.out.println("Dados do professor:");
        funcionario1.exibirDados();
        System.out.println("Salário do professor: " + funcionario1.calcularSalario());
        funcionario1.registrarPresenca();

        System.out.println("\nDados do secretário:");
        funcionario2.exibirDados();
        System.out.println("Salário do secretário: " + funcionario2.calcularSalario());
        funcionario2.registrarPresenca();
    }
}
