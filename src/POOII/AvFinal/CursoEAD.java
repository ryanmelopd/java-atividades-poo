package POOII.AvFinal;

public class CursoEAD extends Curso {
    public CursoEAD(String nome, int cargaHoraria, Nivel nivel) {
        super(nome, cargaHoraria, nivel);
    }

    @Override
    public void iniciar() {
        System.out.println("O acesso deve ser feito pela plataforma virtual.");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }
}
