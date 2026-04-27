package estruturasSequenciais.exerciciosOpcionais1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.nextLine();
        int y = sc.nextInt();
        sc.close();
        int soma = x + y;

        System.out.println("SOMA = " + soma);

    }
}
