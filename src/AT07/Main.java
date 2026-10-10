package AT07;

public class Main {
    public static void main(String[] args) {
        Gerente funcionario1 = new Gerente("Sérgio",261072060,4500.75,600);
        Vendedor funcionario2 = new Vendedor("Nicolas",261072061,2980.14,350,8);
        Estagiario funcionario3 = new Estagiario("Paulo",261072062,1000,"Universidade Califórnia");

        funcionario1.calcularSalario();
        funcionario2.calcularSalario();
        funcionario3.calcularSalario();

        funcionario1.realizarReuniao();
        funcionario2.registrarVenda();
        funcionario3.realizarTreinamento();

        // O Salário final está dentro do metódo apresentarDados() de cada objeto.
        funcionario1.apresentarDados();
        funcionario2.apresentarDados();
        funcionario3.apresentarDados();
    }
}
