package AT06;

public class Main {
    public static void main(String[] args) {

        ReservaHotel reserva1 = new ReservaHotel("Ryan", 37, 5, 150.0);
        ReservaHotel reserva2 = new ReservaHotel("Ana", 40, 4, 170.9);

        // Imprime usando @Override
        System.out.println(reserva1);
        System.out.println();
        System.out.println(reserva2);
        // Chama os metódos e guarda numa variável
        double reserva1HospedagemSemDescontos = reserva1.calcularHospedagem();
        double reserva2Hospedagem = reserva2.calcularHospedagem(5);
        double reserva1Hospedagem = reserva1.calcularHospedagem(5, 7.99);

        System.out.println("\nReserva 1:");
        System.out.printf(
                "Nome do hóspede: %s%n" + "Número do quarto: %d%n" + "Quantidade de diárias: %d%n" + "Valor da diária: R$ %.2f%n",
                reserva1.getNome(), reserva1.getNumeroQuarto(), reserva1.getQuantidadeDiarias(), reserva1.getValorDiaria());
        System.out.printf("Valor da hospedagem: R$ %.2f%n", reserva1Hospedagem);
        System.out.printf("Valor da hospedagem sem desconto e taxa de serviço: R$ %.2f%n", reserva1HospedagemSemDescontos);

        System.out.println("\nReserva 2:");
        System.out.printf("Nome do hóspede: %s%n" + "Número do quarto: %d%n" + "Quantidade de diárias: %d%n" + "Valor da diária: R$ %.2f%n",
                reserva2.getNome(), reserva2.getNumeroQuarto(), reserva2.getQuantidadeDiarias(), reserva2.getValorDiaria());
        System.out.printf("Valor da hospedagem: R$ %.2f%n", reserva2Hospedagem);
    }
}

