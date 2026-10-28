package POOII.AT12;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("\n=== DADOS DO ALUNO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
