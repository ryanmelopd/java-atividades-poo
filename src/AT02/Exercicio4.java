package AtividadesMarcelo.AT02;

public class Exercicio4 {
    public static void main(String[] args) {
        String tituloFilme = "Duna";
        String generoFilme = "Ficção científica";
        int anoDeLancamento = 2021;

        String informacoes = mostrarFilme(tituloFilme,generoFilme,anoDeLancamento);
        int idadeDoFilme = calcularIdadeFilme(anoDeLancamento);
        String classificacao = classificarFilme(anoDeLancamento);

        System.out.println(informacoes);
        System.out.println("Idade do filme: " + idadeDoFilme);
        System.out.println("Classificação: " + classificacao);
    }
    public static String mostrarFilme(String titulo, String genero, int ano) {
        return  "Nome do filme: " + titulo + "\nGenêro do filme: "  + genero + "\nAno de lançamento do filme: " + ano;
    }
    public static int calcularIdadeFilme(int anoFilme) {
        return 2026 - anoFilme;
    }
    public static String classificarFilme(int anoFilme) {
        int idadeDoFilme = calcularIdadeFilme(anoFilme);
            if (idadeDoFilme > 10) {
                return "Clássico";
            } else if (idadeDoFilme <= 2){
                return "Lançamento";
            } else {
                return "Recente";
            }
        }
    }

