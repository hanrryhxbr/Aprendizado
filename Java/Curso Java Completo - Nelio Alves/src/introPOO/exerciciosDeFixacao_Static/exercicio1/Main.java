package introPOO.exerciciosDeFixacao_Static.exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double cotation = input.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantity = input.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.toDolarWithIof(cotation, quantity, 6));

    }
}
