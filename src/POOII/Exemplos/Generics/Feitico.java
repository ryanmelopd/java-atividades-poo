package POOII.Exemplos.Generics;

public class Feitico {
    private String conteudo;

    public Feitico(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public String toString() {
        return "Magia: " + conteudo;
    }
}
