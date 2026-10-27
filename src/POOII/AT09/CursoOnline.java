package POOII.AT09;

public class CursoOnline extends Curso implements Certificavel {
    private double valorPorHora;

    public CursoOnline(String nome, int cargaHoraria, double valorPorHora) {
        super(nome, cargaHoraria);
        this.valorPorHora = valorPorHora;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor por hora: " + valorPorHora);
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        super.emitirCertificado(nomeAluno);
    }
}
