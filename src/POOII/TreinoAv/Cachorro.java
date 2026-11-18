package POOII.TreinoAv;

public class Cachorro extends Animal {
    public Cachorro(String nome, Porte porte) {
        super(nome, porte);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
