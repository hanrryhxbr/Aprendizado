package memoriaArraysListas.exerciciosDeFixacao.exercicio9;

public class UtilMaxIdentifier {

    public static double higherAge(Pessoa[] vetor) {

        double value = vetor[0].getAge();
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].getAge() > value) {

                value = vetor[i].getAge();

            }

        }

        return value;

    }

    public static String higherAgeName(Pessoa[] vetor) {

        double value = vetor[0].getAge();
        String name = null;
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].getAge() > value) {

                value = vetor[i].getAge();
                name = vetor[i].getName();

            }

        }

        return name;

    }

}
