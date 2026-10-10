package AT13.Exercicio2;

public class Main {
    public static void main(String[] args) {
        Forma forma1 = new Retangulo("Retângulo", 10, 3);
        Forma forma2 = new Circulo("Círculo", 4);

        forma1.apresentarDados();
        double areaForma1 = forma1.calcularArea();
        System.out.printf("Área: %.2f%n", areaForma1);

        forma2.apresentarDados();
        double areaForma2 = forma2.calcularArea();
        System.out.printf("Área: %.2f%n", areaForma2);

        Forma[] formas = {forma1, forma2};

        for (Forma forma : formas) {
            forma.apresentarDados();
        }
    }
}
