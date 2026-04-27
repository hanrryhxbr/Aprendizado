package memoriaArraysListas.exerciciosDeFixacao.exercicio4;

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

        int evenQuant = 0;
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {

                System.out.printf("%d  ", vetor[i]);
                evenQuant += 1;

            }

        }

        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + evenQuant);

        input.close();
    }

}
