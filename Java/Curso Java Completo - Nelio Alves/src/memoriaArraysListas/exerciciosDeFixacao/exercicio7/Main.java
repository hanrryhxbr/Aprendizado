package memoriaArraysListas.exerciciosDeFixacao.exercicio7;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();

        double[] vetor = new double[n];

        double media = 0.0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();
            media += vetor[i];

        }

        media /= vetor.length;
        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < media) {

                System.out.println(vetor[i]);

            }
        }

        input.close();

    }
}
