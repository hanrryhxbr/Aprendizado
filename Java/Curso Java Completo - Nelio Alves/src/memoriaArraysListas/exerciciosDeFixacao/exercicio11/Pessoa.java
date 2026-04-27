package memoriaArraysListas.exerciciosDeFixacao.exercicio11;

public final class Pessoa {

    private final double height;
    private final char sex;

    public Pessoa(double height, String sex) {

        this.height = height;
        this.sex = sex.toUpperCase().charAt(0);

    }

    public double getHeight() {

        return height;

    }

    public char getSex() {

        return sex;

    }
}
