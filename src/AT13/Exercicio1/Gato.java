package AT13.Exercicio1;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void apresentarDados() {
        System.out.println("Nome: " + getNome());
    }

}
