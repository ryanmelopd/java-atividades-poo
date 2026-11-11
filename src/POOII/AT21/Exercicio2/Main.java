package POOII.AT21.Exercicio2;

public class Main {
    public static void main(String[] args) {
        for (PrioridadeChamado p : PrioridadeChamado.values()) {
            System.out.println(p + ": " + p.getPrazoHoras() + " horas");
        }
    }
}
