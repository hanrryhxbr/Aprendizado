package EstruturasCondicionais.ExerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double X = input.nextDouble();
        double Y = input.nextDouble();
        input.close();

        if (X > 0.0 && Y > 0.0) {

            System.out.println("Q1");

        } else if (X < 0.0 && Y > 0.0) {

            System.out.println("Q2");

        } else if (X < 0.0 && Y < 0.0) {

            System.out.println("Q3");

        } else if (X > 0.0 && Y < 0.0) {

            System.out.println("Q4");

        } else {

            System.out.println("Origem");

        }

    }

}
