package estruturasRepetitivas.exerciciosOpcionais._for;

import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        input.close();

        for (int i = 1; i <= x; i += 2) {

            System.out.println(i);

        }

    }

}
