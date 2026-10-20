package Exemplos.Interfaces1;

public class Animal implements SerVivo {
    private boolean vivo = true;

    @Override
    public void comer(int massa) {

    }

    @Override
    public void mover() {

    }

    @Override
    public void info() {
        System.out.println("Vivo: " + (this.vivo? "Sim" : "Não"));
    }
}
