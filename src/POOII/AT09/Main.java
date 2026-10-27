package POOII.AT09;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new CursoPresencial("Engenharia de Software", 3200, 20, 50);
        Curso curso2 = new CursoOnline("Ciência de Dados e Inteligência Artificial", 2800, 15);

        curso1.exibirDados();
        curso1.emitirCertificado("Ryan");

        curso2.exibirDados();
        curso2.emitirCertificado("Marcelo");
    }
}
