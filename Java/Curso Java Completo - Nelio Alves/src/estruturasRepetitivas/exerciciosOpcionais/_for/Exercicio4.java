package estruturasRepetitivas.exerciciosOpcionais._for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;

        for (n = input.nextInt(); n > 0; n--) {

            double x = input.nextInt();
            double y = input.nextInt();

            if (y == 0) {

                System.out.println("divisao impossivel");

            } else {

                double resultado = x / y;

                System.out.printf("%.1f%n", resultado);

            }

            input.close();

        }

    }

}
