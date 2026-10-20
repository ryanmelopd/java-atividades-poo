package POOI.AT10.Composicao;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, double cilindro, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(cilindro, combustivel);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void ligarCarro() {
        System.out.println("Ligando o carro " + modelo + "...");
        motor.ligar();
    }

    public void desligarCarro() {
        System.out.println("Desligando o carro " + modelo + "...");
        motor.desligar();
    }

    public void apresentarCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        motor.apresentarMotor();
    }

}
