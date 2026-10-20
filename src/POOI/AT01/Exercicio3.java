package POOI.AT01;
public class Exercicio3 {
    public static void main(String []args) {
        mostrarResultado();
    }
    public static double somarNotas(double a,double b,double c) {
        return (a + b + c);
    }
    public static double calcularMedia(double a,double b,double c) {
        return (somarNotas(a,b,c) / 3);
    }
    public static String verificarSituacao(double notaMedia) {
        if (notaMedia >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    public static void mostrarResultado() {
        double nota1 = 10.0;
        double nota2 = 9.1;
        double nota3 = 7.4;
        double media = calcularMedia(nota1,nota2,nota3);
        String situacaoDoAluno = verificarSituacao(media);

        System.out.println("Notas do aluno: " + 10.0 + ", " + 9.1 + " e " + 7.4);
        System.out.printf("Média do aluno: %.2f%n", media);
        System.out.println("Situação: " + situacaoDoAluno);
    }
}
