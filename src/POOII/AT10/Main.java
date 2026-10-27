package POOII.AT10;

public class Main {
    public static void main(String[] args) {
        Entrega entrega1 = new EntregaBicicleta("9H321I", 5, 2);
        Entrega entrega2 = new EntregaCaminhao("FEW3AL", 20, 5, 30);

        entrega1.exibirDados();
        System.out.println("Frete: " + entrega2.calcularFrete());
        entrega1.rastrear();
        System.out.println();

        entrega2.exibirDados();
        System.out.println("Frete: " + entrega2.calcularFrete());
        entrega2.rastrear();
    }
}
