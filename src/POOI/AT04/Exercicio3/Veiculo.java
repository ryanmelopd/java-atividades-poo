package POOI.AT04.Exercicio3;

public class Veiculo {
    String modelo;
    String marca;
    double velocidadeAtual;

    public Veiculo(String modelo,String marca,double velocidadeAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int valor) {
        velocidadeAtual += valor;
        System.out.println("Acelerando...");
    }

    public void freiar(int valor) {
        if (velocidadeAtual >= valor) {
            velocidadeAtual -= valor;
            System.out.println("Freiando...");
        } else {
            System.out.println("Erro: a velocidade atual não pode ficar abaixo de zero.");
        }
    }

    public void mostrarDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade atual: " + velocidadeAtual);
    }
}
