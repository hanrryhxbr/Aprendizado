package estruturasSequenciais.exerciciosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numeroDePecas1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();
        sc.nextLine();
        int codigo2 = sc.nextInt();
        int numeroDePecas2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();
        sc.close();
        double valorParaPagar = (numeroDePecas1 * valorUnitario1 + numeroDePecas2 * valorUnitario2);

        System.out.printf("VALOR A PAGAR = R$ %.2f", valorParaPagar);

    }
}