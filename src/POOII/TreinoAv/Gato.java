package POOII.TreinoAv;

public class Gato extends Animal {
    public Gato(String nome, Porte porte) {
        super(nome, porte);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
