package EstruturasRepetitivas.ExerciciosOpcionais.For;

import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int fatorial = 1;

        if (n != 0) {

            for (int i = n; i >= 1; i--) {

                fatorial *= i;

            }

        }

        System.out.println(fatorial);

    }

}
