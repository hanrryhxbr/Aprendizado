package EstruturasRepetitivas.ExerciciosOpcionais.For;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;
        int dentroDoIntervalo = 0;
        int foraDoIntervalo = 0;

        for (n = input.nextInt(); n > 0; n--) {

            int x = input.nextInt();
            if (x >= 10 && x <= 20) {

                dentroDoIntervalo++;

            } else {

                foraDoIntervalo++;

            }

        }

        System.out.printf("""
                %d in
                %d out
                """, dentroDoIntervalo, foraDoIntervalo);

        input.close();

    }

}
