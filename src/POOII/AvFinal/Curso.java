package POOII.AvFinal;

public class Curso implements Iniciavel {
    private String nome;
    private int cargaHoraria;
    private Nivel nivel;

    public Curso(String nome, int cargaHoraria, Nivel nivel) {
        if (nome.trim().isBlank()) {
            throw new IllegalArgumentException("O nome não deve ser vazio ou branco.");
        }
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("A carga horária não deve ser menor ou igual a 0.");
        }
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Nivel getNivel() {
        return nivel;
    }

    @Override
    public void iniciar() {

    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Nível: " + nivel);
    }
}
