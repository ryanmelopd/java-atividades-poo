package POOII.Exemplos.Generics;

public class Main {
    public static void main(String[] args) {
        Bolsa<Object> bolsa = new Bolsa<>();

        bolsa.adicionar(new Espada(10));
        bolsa.adicionar(new Familiar("Dragão"));
        bolsa.adicionar(new Feitico("Bola de neve"));
        bolsa.adicionar(new Espada(5));
        bolsa.adicionar(new Feitico("Ventos uivantes"));
        bolsa.adicionar(new Familiar("Guerreiro"));

        System.out.println("Itens incluídos na bolsa:");
        bolsa.apresentarItens();
    }
}
