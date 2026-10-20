package AT06;

public class CaixaDeSom implements Conectavel {
    private String nome;

    public CaixaDeSom(String nome) {
        this.nome = nome;
    }

    @Override
    public void conectar() {
        System.out.println("A caixa de som " + nome + " foi conectada!");
    }

    @Override
    public void desconectar() {
        System.out.println("A caixa de som " + nome + " foi desconectada!");
    }
}
