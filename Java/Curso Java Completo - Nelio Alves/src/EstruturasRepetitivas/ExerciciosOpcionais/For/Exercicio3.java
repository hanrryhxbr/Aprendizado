package EstruturasRepetitivas.ExerciciosOpcionais.For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;

        for (n = input.nextInt(); n > 0; n--) {

            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            double mediaPonderada = ((x * 2) + (y * 3) + (z * 5)) / 10;

            System.out.printf("%.1f%n", mediaPonderada);

        }

        input.close();

    }

}
