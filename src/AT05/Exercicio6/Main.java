package AT05.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Temperatura temp = new Temperatura("Londrina",25.2,"Celsius");

        temp.aumentarTemperatura(3.2);
        temp.diminuirTemperatura(10);
        temp.mostrarDados();
    }
}
