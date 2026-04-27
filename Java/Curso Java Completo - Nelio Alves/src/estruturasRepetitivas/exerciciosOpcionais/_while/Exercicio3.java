package estruturasRepetitivas.exerciciosOpcionais._while;

import java.util.Scanner;

public class Exercicio3 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int entrada = 0;

        while (entrada != 4) {

            entrada = input.nextInt();

            if (entrada == 1) {

                alcool++;

            } else if (entrada == 2) {

                gasolina++;

            } else if (entrada == 3) {

                diesel++;

            }

        }

        input.close();

        System.out.printf("""
                MUITO OBRIGADO
                Alcool: %d
                Gasolina: %d
                Diesel: %d
                """, alcool, gasolina, diesel);

    }
}
