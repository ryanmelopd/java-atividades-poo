package POOI.AT10.Agregacao;

public class Escola {
    private String nome;
    private String localidade;
    private String tipo;
    private Professor professor;

    public Escola(String localidade, String nome, String tipo, Professor professor) {
        this.localidade = localidade;
        this.nome = nome;
        this.tipo = tipo;
        this.professor = professor;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void apresentarEscola() {
        System.out.println("Nome: " + nome);
        System.out.println("Local: " + localidade);
        System.out.println("Tipo: " + tipo);
        System.out.println("\nDados do professor: ");
        professor.apresentarDados();
    }

}
