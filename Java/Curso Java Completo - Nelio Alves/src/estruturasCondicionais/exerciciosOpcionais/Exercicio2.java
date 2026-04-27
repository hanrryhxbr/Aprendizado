package estruturasCondicionais.exerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        input.close();

        if (numero % 2 == 0) {

            System.out.println("PAR");

        } else {

            System.out.println("IMPAR");

        }

    }

}
