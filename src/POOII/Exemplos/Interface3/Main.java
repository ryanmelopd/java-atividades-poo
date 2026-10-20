package POOII.Exemplos.Interface3;

public class Main {
    public static void main(String[] args) {
        Impressora dispositivo1 = new Impressora("ACER-FT2189", false);

        dispositivo1.imprimir();
        dispositivo1.conectar();
        dispositivo1.imprimir();
    }
}
