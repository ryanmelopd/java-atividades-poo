package POOII.Exemplos.Lambda;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
           OperacaoMatematica somar = new OperacaoMatematica() {
               @Override
               public int calcular(int a, int b) {
                   return a + b;
               }
           };
        System.out.println("Soma sem Lambda: " + somar.calcular(5, 6));

        OperacaoMatematica somarComLambda = (int a, int b) -> a + b;
        System.out.println("Soma com Lambda: " + somarComLambda.calcular(5, 6));
    }
}