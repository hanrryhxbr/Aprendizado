package estruturasRepetitivas.exerciciosOpcionais._for;

import java.util.Scanner;

public class Exercicio7 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();



        for (int i = 1; i <= n; i++) {

            System.out.printf("%d %d %d%n", i, i * i, i * i *i);

        }
    }
}
