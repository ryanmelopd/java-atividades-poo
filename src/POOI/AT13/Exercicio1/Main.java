package POOI.AT13.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro("Bob");
        Animal animal2 = new Gato("Tigrão");

        animal1.emitirSom();
        animal1.apresentarDados();

        animal2.emitirSom();
        animal2.apresentarDados();
    }
}
