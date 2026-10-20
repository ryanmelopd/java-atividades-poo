package AT03;

public class Mago extends Personagem {
    private double ataqueMagico;

    public Mago(String nome, int nivel, double ataqueMagico) {
        super(nome, nivel);
        this.ataqueMagico = ataqueMagico;
    }

    @Override
    public void atacar() {
        System.out.println("Mago usou Lança feitiço! O ataque deu " + ataqueMagico + " de dano.");
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Dano de ataque: " + ataqueMagico);
    }
}
