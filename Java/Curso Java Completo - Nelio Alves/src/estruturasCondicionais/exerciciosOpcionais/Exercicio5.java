package estruturasCondicionais.exerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        input.close();
        double total = 0.00;

        switch (A) {

            case 1:
                total = 4.00 * B;
                break;

            case 2:
                total = 4.50 * B;
                break;

            case 3:
                total = 5.00 * B;
                break;

            case 4:
                total = 2.00 * B;
                break;

            case 5:
                total = 1.50 * B;
                break;

        }

        System.out.printf("Total: %.2f%n", total);

    }

}
