package POOI.Exemplos.ExemploPOO;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Gerente("Marcelo", 4500);
        Funcionario funcionario2 = new Desenvolvedor("Ryan", 3200);
        Trabalhador trabalhador3 = new Robo();

        funcionario1.mostrarDados();
        funcionario2.mostrarDados();

        funcionario1.trabalhar();
        funcionario2.trabalhar();
        trabalhador3.trabalhar();
    }
}