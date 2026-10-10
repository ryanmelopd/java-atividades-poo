package AtividadesMarcelo.AT02;

public class Exercicio6 {
    public static void main(String[] args) {
        mostrarRelatorios();
    }
    public static int calcularPontos(int vitorias,int empates) {
        return (vitorias * 3) + empates;
    }
    public static int calcularAproveitamento(int pontos,int partidas,int vitorias,int empates) {
        pontos = calcularPontos(empates,vitorias);
        int pontosMaximos = partidas * 3;
        return (pontos * 100) / pontosMaximos;
    }
    public static String verificarSituacao(int aproveitamento) {
        if (aproveitamento >= 80) {
            return "Excelente";
        } else if (aproveitamento >=60) {
            return "Bom";
        } else if (aproveitamento >= 40) {
            return "Regular";
        } else {
            return "Ruim";
        }
    }
    public static void mostrarRelatorios() {
        int quantidadePartidas = 38;
        int quantidadeVitorias = 16;
        int quantidadeEmpates = 18;
        int quantidadeDerrotas = 4;

        int pontos = calcularPontos(quantidadeEmpates,quantidadeVitorias);
        int aproveitamento = calcularAproveitamento(pontos,quantidadePartidas,quantidadeVitorias,quantidadeEmpates);
        String situacao = verificarSituacao(aproveitamento);

        System.out.println("Partidas: " + quantidadePartidas);
        System.out.println("Vitórias: " + quantidadeVitorias);
        System.out.println("Empates: " + quantidadeEmpates);
        System.out.println("Derrotas: " + quantidadeDerrotas);
        System.out.println("Pontos: " + pontos);
        System.out.println("Aproveitamento: " + aproveitamento + "%");
        System.out.println("Situação: " + situacao);
    }
}
