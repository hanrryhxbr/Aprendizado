package EstruturasRepetitivas.ExerciciosOpcionais.While;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();

        while (X != 0 && Y != 0) {

            if (X > 0 && Y > 0) {

                System.out.println("primeiro");

            } else if (X < 0 && Y > 0) {

                System.out.println("segundo");

            } else if (X < 0 && Y < 0) {

                System.out.println("terceiro");

            } else if (X > 0 && Y < 0) {

                System.out.println("quarto");

            }

            X = input.nextInt();
            Y = input.nextInt();

        }

        input.close();

    }
}
