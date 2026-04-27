package memoriaArraysListas.exerciciosDeFixacao.exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numero voce vai digitar? ");
        int n = input.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();

        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("%.1f  ", vetor[i]);

        }

        double sum = 0;
        for (int i = 0; i < vetor.length; i++) {

            sum += vetor[i];

        }

        System.out.printf("%nSOMA = %.2f%n", sum);

        double avg = sum / vetor.length;

        System.out.printf("MEDIA = %.2f%n", avg);

        input.close();

    }

}
