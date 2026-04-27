package introPOO.exerciciosDeFixacao_NoStatic.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        student.name = input.nextLine();
        student.firstScore = input.nextDouble();
        student.secondScore = input.nextDouble();
        student.thirdScore = input.nextDouble();

        student.showFinalGrade();
        student.showSituation();

    }
}
