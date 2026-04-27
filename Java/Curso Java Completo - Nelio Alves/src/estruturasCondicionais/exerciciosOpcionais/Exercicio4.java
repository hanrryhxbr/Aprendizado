package estruturasCondicionais.exerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        input.close();

        if (A < B) {

            System.out.printf("O JOGO DUROU %d HORA(S)%n", (B - A));

        } else {

            System.out.printf("O JOGO DUROU %d HORA(S)%n", ((B + 24) - A));

        }

    }

}
