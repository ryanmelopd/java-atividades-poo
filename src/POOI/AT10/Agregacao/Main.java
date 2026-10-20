package POOI.AT10.Agregacao;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Leandro","Matemática");
        Escola escola = new Escola("Londrina", "Londrinense Anglo", "Técnica", professor);
        escola.apresentarEscola();
    }
}
