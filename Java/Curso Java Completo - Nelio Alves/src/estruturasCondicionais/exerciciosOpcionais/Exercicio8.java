package estruturasCondicionais.exerciciosOpcionais;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio8 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();
        input.close();
        double impostoParaPagar = 0.00;

        if ( salario >= 0.00 && salario <= 2000.00) {

            System.out.println("Isento");

        } else if (salario <= 3000) {

            impostoParaPagar += (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", impostoParaPagar);

        } else if ( salario <= 4500 ) {

            impostoParaPagar += 1000 * 0.08;
            impostoParaPagar += (salario - 3000) * 0.18;
            System.out.printf("R$ %.2f%n", impostoParaPagar);

        } else if ( salario > 4500 ) {

            impostoParaPagar += 1000 * 0.08;
            impostoParaPagar += 1500 * 0.18;
            impostoParaPagar += (salario - 4500) * 0.28;
            System.out.printf("R$ %.2f%n", impostoParaPagar);

        }

    }

}
