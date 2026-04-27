package memoriaArraysListas.exerciciosDeFixacao.exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();

        double[] vetor = new double[n];

        double media = 0.0;
        int quantidadeDePares = 0;

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();
            if (vetor[i] % 2 == 0) {

                media += vetor[i];
                quantidadeDePares += 1;

            }

        }

        media /= quantidadeDePares;
        System.out.println();

        if (quantidadeDePares > 0) {

            System.out.printf("MEDIA DOS PARES = %.1f%n", media);

        } else {

            System.out.println("NENHUM NUMERO PAR");

        }

        input.close();

    }

}
