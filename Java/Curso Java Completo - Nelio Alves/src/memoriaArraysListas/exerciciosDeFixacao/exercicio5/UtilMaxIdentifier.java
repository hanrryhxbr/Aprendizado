package memoriaArraysListas.exerciciosDeFixacao.exercicio5;

public class UtilMaxIdentifier {

    public static double higherValue(double[] vetor) {

        double value = vetor[0];
        for (int i =0; i < vetor.length; i++) {

            if (vetor[i] > value) {

                value = vetor[i];

            }

        }

        return value;

    }

    public static int higherValuePosition(double[] vetor) {

        double value = vetor[0];
        int position = 0;
        for (int i =0; i < vetor.length; i++) {

            if (vetor[i] > value) {

                position = i;

            }

        }

        return position;

    }

}
