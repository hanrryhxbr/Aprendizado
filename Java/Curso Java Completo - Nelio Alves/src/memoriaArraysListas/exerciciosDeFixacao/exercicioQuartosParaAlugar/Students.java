package memoriaArraysListas.exerciciosDeFixacao.exercicioQuartosParaAlugar;

public class Students {

    private final String name;
    private final String email;

    public Students(String nome, String email) {

        this.name = nome;
        this.email = email;

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {

        return this.name + ", " + this.email;

    }
}
