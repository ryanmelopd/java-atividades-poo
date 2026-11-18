package POOII.TreinoAv;

public abstract class Animal implements Sonoro {
    private String nome;
    private Porte porte;

    public Animal(String nome, Porte porte) {
        if (nome.trim().isBlank()) {
            throw new IllegalArgumentException("O nome não deve ser vazio ou conter apenas espaços.");
        }
        this.nome = nome;
        this.porte = porte;
    }

    public String getNome() {
        return nome;
    }

    public Porte getPorte() {
        return porte;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Porte: " + porte);
    }
}
