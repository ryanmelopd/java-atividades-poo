package POOII.AT15;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("L001", "Dom Casmurro");
        livro.exibirDados();
        Emprestavel emprestavel = livro;

        // 1. Primeiro empréstimo
        System.out.println("\n=== Primeiro empréstimo ===");
        try {
            emprestavel.emprestar();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            livro.exibirSituacao();
        }

        // 2. Novo empréstimo
        System.out.println("\n=== Segundo empréstimo ===");
        try {
            emprestavel.emprestar();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            livro.exibirSituacao();
        }

        // 3. Devolução
        System.out.println("\n=== Primeira devolução ===");
        try {
            emprestavel.devolver();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            livro.exibirSituacao();
        }

        // 4. Nova devolução
        System.out.println("\n=== Segunda devolução ===");
        try {
            emprestavel.devolver();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            livro.exibirSituacao();
        }
    }
}
