package AT06;

public class Main {
    public static void main(String[] args) {
        Conectavel dispositivo1 = new Impressora("ACER");
        Conectavel dispositivo2 = new CaixaDeSom("JBL");

        dispositivo1.conectar();
        dispositivo2.conectar();

        dispositivo2.desconectar();
        dispositivo2.desconectar();
    }
}
