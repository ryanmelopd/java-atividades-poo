package Exemplos.Matriz4x4;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        System.out.println("Digite os números da matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]:");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                System.out.print(" ");
                }
            System.out.println();
            }
    }
}
