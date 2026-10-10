package AT13.Exercicio1;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void apresentarDados() {
        System.out.println("Nome: " + getNome());
    }

}
