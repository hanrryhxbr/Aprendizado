package memoriaArraysListas.exerciciosDeFixacao.exercicio6;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = input.nextInt();

        int[] vetorA = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {

            vetorA[i] = input.nextInt();

        }

        int[] vetorB = new int[n];
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {

            vetorB[i] = input.nextInt();

        }

        int[] vetorResultante = UtilVectorSum.twoVectorSum(vetorA, vetorB);
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetorResultante.length; i++) {

            System.out.println(vetorResultante[i]);

        }

        input.close();

    }

}
