package AT03;

public class Guerreiro extends Personagem {
    private double ataqueFisico;

    public Guerreiro(String nome, int nivel, double ataqueFisico) {
        super(nome, nivel);
        this.ataqueFisico = ataqueFisico;
    }

    @Override
    public void atacar() {
        System.out.println("Guerreiro usou Golpe de espada! O ataque deu " + ataqueFisico + " de dano.");
    }

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Dano de ataque: " + ataqueFisico);
    }
}
