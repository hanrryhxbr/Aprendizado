package memoriaArraysListas.exerciciosDeFixacao.exercicio1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();

        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < 0) {

                System.out.println(vetor[i]);

            }

        }

        input.close();
    }
}
