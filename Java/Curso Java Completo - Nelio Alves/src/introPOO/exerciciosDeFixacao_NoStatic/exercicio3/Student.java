package introPOO.exerciciosDeFixacao_NoStatic.exercicio3;

public class Student {

    String name;
    public double firstScore = 0.00;
    public double secondScore = 0.00;
    public double thirdScore = 0.00;

    public double getFinalScore() {

        return this.firstScore + this.secondScore + this.thirdScore;

    }

    public void showFinalGrade() {

        System.out.printf("FINAL GRADE = %.2f%n", this.getFinalScore());

    }

    public void showSituation() {

        if (this.getFinalScore() > 60) {

            System.out.println("PASS");

        } else {

            System.out.println("FAILED");
            System.out.printf("MISSING POINTS = %.2f%n", (60 - this.getFinalScore()));

        }

    }

}
