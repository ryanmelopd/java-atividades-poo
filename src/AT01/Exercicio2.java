package AtividadesMarcelo.AT01;
public class Exercicio2 {
    public static void main(String[] args) {
        double valorFinal = calcularDesconto(72.80,15.0);
        System.out.println("Preço original: " + 72.80);
        System.out.println("Percentual de desconto: 15%");
        System.out.println("Preço final com desconto: " + valorFinal);
    }
    public static double calcularDesconto(double preco, double desconto) {
        return preco - (preco * (desconto / 100));
    }
}
