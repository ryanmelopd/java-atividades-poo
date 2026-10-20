package AT02;

public class Main {
    public static void main(String[] args) {
        Entrega entrega1 = new EntregaLocal("ABC");
        Entrega entrega2 = new EntregaNacional("EFG", 5);

        System.out.println("Entrega local:");
        entrega1.exibirResumo();
        System.out.println("\nEntrega nacional:");
        entrega2.exibirResumo();
    }
}