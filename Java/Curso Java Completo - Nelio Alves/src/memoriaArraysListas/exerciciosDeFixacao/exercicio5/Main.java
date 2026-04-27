package memoriaArraysListas.exerciciosDeFixacao.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();

        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", UtilMaxIdentifier.higherValue(vetor));
        System.out.printf("POSICAO MAIOR VALOR = %d%n", UtilMaxIdentifier.higherValuePosition(vetor));

        input.close();

    }

}
