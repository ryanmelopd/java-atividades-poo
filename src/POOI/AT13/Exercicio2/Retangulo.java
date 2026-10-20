package AT13.Exercicio2;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void apresentarDados() {
        System.out.println("Nome: " +getNome());
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }

}
