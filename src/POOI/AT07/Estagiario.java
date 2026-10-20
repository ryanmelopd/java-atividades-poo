package POOI.AT07;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, long matricula, double salarioBase, String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        if (instituicaoEnsino == null || instituicaoEnsino.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da instituição de ensino não pode ficar vazio.");}
        this.instituicaoEnsino = instituicaoEnsino;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Instituição de Ensino: " + instituicaoEnsino);
        double salarioFinal = calcularSalario();
        System.out.printf("Salário final: R$ %.2f%n" , salarioFinal);
    }

    public void realizarTreinamento() {
        System.out.println("O estagiário esta realizando um treinamento.");
    }

}
