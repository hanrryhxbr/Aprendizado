package EstruturasCondicionais.ExerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        input.close();

        if (numero > 0) {

            System.out.println("NAO NEGATIVO");

        } else {

            System.out.println("NEGATIVO");

        }

    }

}
