package POOII.AT11;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("ABC1D13", "Kwid", 150, 4);
        Veiculo veiculo2 = new Moto("X7U2ND", "CG 180", 80, 160);

        veiculo1.exibirDados();
        veiculo2.exibirDados();

        System.out.println("\n=== OPERAÇÕES ===");
        veiculo1.ligar();
        veiculo1.desligar();
        veiculo2.ligar();
        veiculo2.desligar();
    }
}
