package POOII.Exemplos.Generics;

public class Espada {
    private int tamanho;

    public Espada(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Espada de tamanho " + tamanho;
    }
}
