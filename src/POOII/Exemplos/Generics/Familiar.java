package POOII.Exemplos.Generics;

public class Familiar {
    private String nome;

    public Familiar(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Familir de nome " + nome;
    }
}
