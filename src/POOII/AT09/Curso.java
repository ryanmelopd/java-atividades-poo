package POOII.AT09;

public abstract class Curso implements Certificavel {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Carga horária: " + cargaHoraria);
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Emitindo certificado...");
    }
}
