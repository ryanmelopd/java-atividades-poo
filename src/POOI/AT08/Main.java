package POOI.AT08;

public class Main {
    public static void main(String[] args) {
        Medico medico = new Medico("Ryan","Clínica médica","CRM/SP 123456");
        Paciente paciente = new Paciente("Juliana",45,"082.937.659-01");

        medico.apresentarMedico();
        paciente.apresentarPaciente();
        System.out.println("===========");
        paciente.realizarConsulta(medico);
        System.out.println("===========");
        System.out.println("Objetos continuam existindo:");
        medico.apresentarMedico();
        paciente.apresentarPaciente();
    }
}
