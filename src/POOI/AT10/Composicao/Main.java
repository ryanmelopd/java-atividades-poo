package POOI.AT10.Composicao;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari","Spider",2000,50);

        System.out.println("Dados iniciais:");
        carro.apresentarCarro();
        System.out.println("\nLigando o carro:");
        carro.ligarCarro();
        System.out.println("\nDados atualizados após ligar o carro:");
        carro.apresentarCarro();
        System.out.println("\nDesligando carro:");
        carro.desligarCarro();
        System.out.println("\nDados finais:");
        carro.apresentarCarro();
    }
}
