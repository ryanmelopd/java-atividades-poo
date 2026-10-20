package POOI.AT10.Composicao;

public class Motor {

    private double cilindrada;
    private double combustivel;
    private boolean ligado;

    public Motor(double cilindrada, double combustivel) {
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
        this.ligado = false;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        } else {
            System.out.println("Erro: O número deve ser maior que zero.");
        }
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        if (combustivel > 0) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Erro: O combustível deve ser maior que zero.");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("Erro: O carro já está ligado.");
        } else {
            ligado = true;
            System.out.println("Carro ligado com sucesso.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("Erro: O carro já está ligado.");
        } else {
            this.ligado = false;
            System.out.println("Carro desligado com sucesso.");
        }
    }

    public void apresentarMotor() {
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Combustível: " + combustivel);
        if (ligado) {
            System.out.println("Estado do motor: ligado");
        } else {
            System.out.println("Estado do motor: desligado");
        }
    }

}

