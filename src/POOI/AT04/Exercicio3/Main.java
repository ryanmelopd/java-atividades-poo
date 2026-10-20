package POOI.AT04.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Sandero","Renault",80.0);

        v1.acelerar(20);
        v1.freiar(15);
        v1.mostrarDados();

    }
}
