package POOII.AT21.Exercicio3;

public class Livro {
    private String titulo;
    private SituacaoLivro situacao;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.situacao = SituacaoLivro.DISPONIVEL;
    }

    public boolean emprestar() {
        if (situacao == SituacaoLivro.DISPONIVEL) {
            situacao = SituacaoLivro.EMPRESTADO;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (situacao == SituacaoLivro.EMPRESTADO) {
            situacao = SituacaoLivro.DISPONIVEL;
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public SituacaoLivro getSituacao() {
        return situacao;
    }
}