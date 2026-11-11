package POOII.AT21.Exercicio1;

public class Main {
    public static void main(String[] args) {
        CorSemaforo cor = CorSemaforo.VERMELHO;

        switch (cor) {
            case VERMELHO:
                System.out.println("Pare.");
                break;
            case AMARELO:
                System.out.println("Atenção.");
                break;
            case VERDE:
                System.out.println("Siga.");
                break;
        }
    }
}