package POOII.AT21.Exercicio3;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Percy Jackson");

        boolean resultado = livro.emprestar();
        System.out.println("1º empréstimo: " + resultado + " | Situação: " + livro.getSituacao());

        resultado = livro.emprestar();
        System.out.println("2º empréstimo: " + resultado + " | Situação: " + livro.getSituacao());

        resultado = livro.devolver();
        System.out.println("Devolução: " + resultado + " | Situação: " + livro.getSituacao());
    }
}
