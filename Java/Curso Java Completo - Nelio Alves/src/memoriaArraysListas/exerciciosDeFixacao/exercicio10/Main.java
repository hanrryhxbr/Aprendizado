package memoriaArraysListas.exerciciosDeFixacao.exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = input.nextInt();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {

            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");

            String nome = input.next();
            double primeiraNota = input.nextDouble();
            double segundaNota = input.nextDouble();

            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);

        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i].getSituation()) {

                System.out.println(alunos[i].getName());

            }

        }

    }
}
