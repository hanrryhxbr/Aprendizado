package memoriaArraysListas.exerciciosDeFixacao.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");
            String nome = input.next();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();

            vetor[i] = new Pessoa(nome, idade, altura);

        }

        double sumHeight = 0;

        for (int i = 0; i < vetor.length; i++) {

            sumHeight += vetor[i].getHeight();

        }

        double avgHeight = sumHeight / vetor.length;

        System.out.printf("Altura média: %.2f%n", avgHeight);

        double percentage = 0.0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].getAge() < 16 ) {

                percentage += (1.0 / vetor.length) * 100;

            }

        }

        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentage) + "%");

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].getAge() < 16 ) {

                System.out.println(vetor[i].getName());

            }

        }

        input.close();

    }

}
