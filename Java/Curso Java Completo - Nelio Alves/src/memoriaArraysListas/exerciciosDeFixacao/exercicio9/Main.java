package memoriaArraysListas.exerciciosDeFixacao.exercicio9;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = input.nextInt();

        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = input.next();

            System.out.print("Idade: ");
            int idade = input.nextInt();

            vetor[i] = new Pessoa(nome, idade);

        }

        System.out.println("PESSOA MAIS VELHA: " + UtilMaxIdentifier.higherAgeName(vetor));

    }

}
