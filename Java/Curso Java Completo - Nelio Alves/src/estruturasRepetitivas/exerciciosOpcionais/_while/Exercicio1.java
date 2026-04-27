package estruturasRepetitivas.exerciciosOpcionais._while;

import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int senhaCorreta = 2002;
        int senha = 0;

        while (senha != senhaCorreta) {

            senha = input.nextInt();

            if (senha != 2002) {

                System.out.println("Senha inválida");

            } else {

                System.out.println("Acesso permitido");

            }

        }

        input.close();

    }
}
