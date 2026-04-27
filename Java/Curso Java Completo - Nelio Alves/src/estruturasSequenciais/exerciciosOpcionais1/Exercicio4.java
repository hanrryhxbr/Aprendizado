package estruturasSequenciais.exerciciosOpcionais1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        sc.nextLine();
        int horasDeTrabalho = sc.nextInt();
        sc.nextLine();
        double salarioPorHora = sc.nextDouble();
        sc.close();
        double salarioReal = salarioPorHora * horasDeTrabalho;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salarioReal);

    }
}