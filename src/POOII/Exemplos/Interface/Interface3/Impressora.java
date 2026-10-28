package POOII.Exemplos.Interface.Interface3;

public class Impressora implements Conectavel, Imprimivel {
    private String modelo;
    private boolean conectado;

    public Impressora(String modelo, boolean conectado) {
        this.modelo = modelo;
        this.conectado = conectado;
    }

    @Override
    public void conectar() {
        conectado = true;
        System.out.println("Modelo " + modelo + " conectado ao Wi-fi.");
    }

    @Override
    public void desconectar() {
        conectado = false;
        System.out.println("Modelo " + modelo + " desconectado ao Wi-fi.");
    }

    @Override
    public void imprimir() {
        if (conectado) {
            System.out.println(modelo + " imprimindo.");
        } else {
            System.out.println("Não é possível imprimir: Impressora " + modelo + " desconectada.");
        }
    }
}

