package memoriaArraysListas.exerciciosDeFixacao.exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = input.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.print("Altura da " + (i+1) + "a pessoa: ");
            double altura = input.nextDouble();

            System.out.print("Sexo da " + (i+1) + "a pessoa: ");
            String sexo = input.next();

            pessoas[i] = new Pessoa(altura, sexo);

        }

        System.out.printf("Menor altura = %.2f%n", PessoaVectorUtilities.getMinHeight(pessoas));
        System.out.printf("Maior altura = %.2f%n", PessoaVectorUtilities.getMaxHeight(pessoas));
        System.out.printf("Media das alturas das mulheres = %.2f%n", PessoaVectorUtilities.getAvgHeightForWomen(pessoas));
        System.out.printf("Numero de homens =  %.2f%n", PessoaVectorUtilities.getMenQuantity(pessoas));

    }
}
