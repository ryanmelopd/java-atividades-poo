package POOII.AT09;

public class CursoPresencial extends Curso implements Certificavel {
    private double valorPorHora;
    private double valorMaterial;

    public CursoPresencial(String nome, int cargaHoraria, double valorPorHora, double valorMaterial) {
        super(nome, cargaHoraria);
        this.valorPorHora = valorPorHora;
        this.valorMaterial = valorMaterial;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Valor por hora: " + valorPorHora);
        System.out.println("Valor do material: " + valorMaterial);
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        super.emitirCertificado(nomeAluno);
    }
}
