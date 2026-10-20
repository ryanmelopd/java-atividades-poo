package POOI.AT13.Exercicio1;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("Som do animal");
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
    }

}
