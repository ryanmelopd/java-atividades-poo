package AT05.Exercicio6;

public class Temperatura {
    String nomeCidade;
    double temperaturaAtual;
    String unidadeMedida;

    public Temperatura(String nomeCidade,double temperaturaAtual,String unidadeMedida) {
        this.nomeCidade = nomeCidade;
        this.temperaturaAtual = temperaturaAtual;
        this.unidadeMedida = unidadeMedida;
    }

    public void aumentarTemperatura(double valor) {
        if (valor > 0) {
          this.temperaturaAtual += valor;
            System.out.println("Temperatura aumentada.");
        } else {
            System.out.println("Erro: o valor deve ser positivo.");
        }
    }

    public void diminuirTemperatura(double valor) {
        if (valor > 0) {
            this.temperaturaAtual -= valor;
            System.out.println("Temperatura diminuída.");
        } else {
            System.out.println("Erro: o valor deve ser positivo.");
        }
    }

    public void mostrarDados() {
        System.out.println("Cidade: " + nomeCidade);
        System.out.println("Temperatura atual: " + temperaturaAtual + " " + unidadeMedida);
        System.out.println("Unidade de medida: " + unidadeMedida);
    }
}
