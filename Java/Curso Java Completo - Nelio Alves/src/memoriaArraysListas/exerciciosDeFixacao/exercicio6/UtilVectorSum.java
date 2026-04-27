package memoriaArraysListas.exerciciosDeFixacao.exercicio6;

public class UtilVectorSum {

    public static int[] twoVectorSum(int[] vectorA, int[] vectorB) {

        int[] resultingVector = new int[vectorA.length];

        for (int i = 0; i < vectorA.length; i++) {

            resultingVector[i] = (vectorA[i] + vectorB[i]);

        }

        return resultingVector;

    }

}
