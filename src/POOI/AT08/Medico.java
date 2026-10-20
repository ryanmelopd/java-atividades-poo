package POOI.AT08;

public class Medico {
    private String nome;
    private String especialidade;
    private String crm;

    public Medico(String nome, String especialidade, String crm) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do médico não pode ficar vazio.");
        }
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.trim().isEmpty()) {
            throw new IllegalArgumentException("A especialidade deve ser informada.");
        }
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if (crm == null || crm.trim().isEmpty()) {
            throw new IllegalArgumentException("O CRM não pode ficar vazio.");
        }
        this.crm = crm;
    }

    public void apresentarMedico() {
        System.out.println("Nome do médico: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + crm);
    }
}
