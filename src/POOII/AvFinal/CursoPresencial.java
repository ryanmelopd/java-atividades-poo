package POOII.AvFinal;

public class CursoPresencial extends Curso {
    public CursoPresencial(String nome, int cargaHoraria, Nivel nivel) {
        super(nome, cargaHoraria, nivel);
    }

    @Override
    public void iniciar() {
        System.out.println("As aulas ocorrerão na instituição.");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
