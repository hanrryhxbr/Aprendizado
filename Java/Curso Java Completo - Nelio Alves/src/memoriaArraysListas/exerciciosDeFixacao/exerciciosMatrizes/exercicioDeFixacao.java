package memoriaArraysListas.exerciciosDeFixacao.exerciciosMatrizes;

import java.util.Scanner;

public class exercicioDeFixacao {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = input.nextInt();

            }

        }

        int x = input.nextInt();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == x) {

                    System.out.println("Position " + i + "," + j + ": ");

                    if (j-1 >= 0) {

                        System.out.print("Left: ");
                        System.out.println(matriz[i][j-1]);

                    }

                    if (i-1 >= 0) {

                        System.out.print("Up: ");
                        System.out.println(matriz[i-1][j]);

                    }

                    if (j+1 < matriz[i].length) {

                        System.out.print("Right: ");
                        System.out.println(matriz[i][j+1]);

                    }

                    if (i+1 < matriz.length) {

                        System.out.print("Down: ");
                        System.out.println(matriz[i+1][j]);

                    }

                }

            }

        }

    }

}
