package POOI.Exemplos.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marcelo", 3000);
        Funcionario f2 = new Gerente("Davi", 7500, 250);
        Funcionario f3 = new Vendedor("Leonardo", 6200, 100000, 3);

        System.out.println("Funcionário comum: ");
        f1.apresentarDados();
        System.out.println("Gerente: ");
        f2.apresentarDados();
        System.out.println("Vendedor: ");
        f3.apresentarDados();
    }
}
