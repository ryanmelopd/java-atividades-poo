package AT03;

public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Guerreiro("Marcelo", 100, 900);
        Personagem personagem2 = new Mago("Eron", 78, 560);

        System.out.println("Status do Guerreiro:");
        personagem1.exibirStatus();
        System.out.println("\nStatus do Mago");
        personagem2.exibirStatus();

        System.out.println("\nAtaque do Guerreiro:");
        personagem1.atacar();
        System.out.println("\nAtaque do Mago:");
        personagem2.atacar();
    }
}
