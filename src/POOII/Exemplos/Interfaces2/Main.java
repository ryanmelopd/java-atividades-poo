package Exemplos.Interfaces2;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica figura1 = new Retangulo(2,10);
        FiguraGeometrica figura2 = new Circulo(3);

        System.out.println("Cálculo da área da figura 1: " + figura1.calcularArea());
        System.out.println("Cálculo do perímetro da figura 1: " + figura1.calcularPerimetro());

        System.out.println("\nCálculo da área da figura 2: " + figura2.calcularArea());
        System.out.println("Cálculo do perímetro da figura 2: " + figura2.calcularPerimetro());
    }
}
