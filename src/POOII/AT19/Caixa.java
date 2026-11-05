package POOII.AT19;

public class Caixa<T> {
    private T conteudo;

    public Caixa(T conteudo) {
        this.conteudo = conteudo;
    }

    public void guardar(T conteudoNovo) {
        conteudo = conteudoNovo;
    }

    public T obter() {
        return conteudo;
    }
}
