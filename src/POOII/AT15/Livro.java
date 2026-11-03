package POOII.AT15;

public class Livro extends MaterialBiblioteca implements Emprestavel {
    private boolean emprestado = false;

    public Livro(String codigo, String titulo) {
        super(codigo, titulo);
    }

    @Override
    public void emprestar() {
        if (emprestado) {
            throw new IllegalStateException("Erro: o livro já está emprestado.");
        }
        emprestado = true;
        System.out.println("Livro emprestado com sucesso!");
    }

    @Override
    public void devolver() {
        if (!emprestado) {
            throw new IllegalStateException("Erro: o livro não está emprestado.");
        }
        emprestado = false;
        System.out.println("Livro devolvido com sucesso!");
    }

    @Override
    public void exibirSituacao() {
        if (emprestado) {
            System.out.println("Situação: Emprestado");
        } else {
            System.out.println("Situação: Disponível");
        }
    }
}