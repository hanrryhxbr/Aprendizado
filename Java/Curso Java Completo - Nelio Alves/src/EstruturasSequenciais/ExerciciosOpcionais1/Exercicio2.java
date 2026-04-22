package EstruturasSequenciais.ExerciciosOpcionais1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();
        sc.close();
        double areaDoCirculo = Math.pow(raio, 2) * pi;

        System.out.printf("A= %.4f", areaDoCirculo);

    }
}