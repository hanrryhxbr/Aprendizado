package memoriaArraysListas.exerciciosDeFixacao.exercicio10;

public class Aluno {

    private final String name;
    private final double firstGrade;
    private final double secondGrade;

    public Aluno(String name, double firstGrade, double secondGrade) {

        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;

    }

    public boolean getSituation() {

        double avg = (this.firstGrade + this.secondGrade) / 2;
        return avg >= 6.0;

    }

    public String getName() {

        return this.name;

    }

}
