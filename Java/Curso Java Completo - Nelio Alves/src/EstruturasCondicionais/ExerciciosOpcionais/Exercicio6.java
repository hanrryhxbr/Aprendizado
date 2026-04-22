package EstruturasCondicionais.ExerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A = input.nextDouble();
        input.close();

        if (0.0 <= A && A <= 25.0) {

            System.out.println("Intervalo [0,25]");

        } else if (25.0 < A && A <= 50.0) {

            System.out.println("Intervalo (25,50]");

        } else if (50.0 < A && A <= 75.0) {

            System.out.println("Intervalo (50,75]");

        } else if (75.0 < A && A <= 100.0) {

            System.out.println("Intervalo (75,100]");

        } else {

            System.out.println("Fora de intervalo");

        }

    }

}
