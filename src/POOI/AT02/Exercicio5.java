package POOI.AT02;

public class Exercicio5 {
    public static void main(String[] args) {
     String nomeMorador = "Renato";
     double consumoMorador = 13.5;
     double valorMultiplicar = 4.50;

     String informacoes = mostrarConsumo(nomeMorador,consumoMorador);
     double valorFinal = calcularValorConta(consumoMorador,valorMultiplicar);
     String classificacao = classificarConsumo(valorFinal);

        System.out.println(informacoes);
        System.out.println("Valor a pagar: " + valorFinal);
        System.out.println("Classificação: " + classificacao);
    }
    public static String mostrarConsumo(String nome,double consumo) {
        String informacoes = "Nome do consumidor: " + nome + "\nConsumo de água: " + consumo;
        return informacoes;
    }
    public static double calcularValorConta(double consumo, double valor) {
        return consumo * valor;
    }
    public static String classificarConsumo(double valor) {
        if (valor <= 10) {
            return "Baixo";
        } else if (valor >= 11 && valor <= 20) {
            return "Médio";
        } else {
            return "Alto";
        }
    }
}
