package memoriaArraysListas.exerciciosDeFixacao.exercicio11;

public class PessoaVectorUtilities {

    public static int getWomenQuantity(Pessoa[] vector) {

        int quantity = 0;
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getSex() == 'F') {

                quantity++;

            }
        }

        return quantity;

    }

    public static int getMenQuantity(Pessoa[] vector) {

        int quantity = 0;
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getSex() == 'M') {

                quantity++;

            }
        }

        return quantity;

    }

    public static double getMaxHeight(Pessoa[] vector) {

        double maxHeight = vector[0].getHeight();
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getHeight() > maxHeight) {

                maxHeight = vector[i].getHeight();

            }

        }

        return maxHeight;

    }

    public static double getMinHeight(Pessoa[] vector) {

        double minHeight = vector[0].getHeight();
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getHeight() < minHeight) {

                minHeight = vector[i].getHeight();

            }

        }

        return minHeight;

    }

    public static double getAvgHeight(Pessoa[] vector) {

        double avgHeight = 0.0;
        for (int i = 0; i < vector.length; i++) {

            avgHeight += vector[i].getHeight();

        }
        avgHeight /= vector.length;

        return avgHeight;

    }

    public static double getAvgHeightForWomen(Pessoa[] vector) {

        double avgHeight = 0.0;
        int quantity = 0;
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getSex() == 'F') {

                avgHeight += vector[i].getHeight();
                quantity++;


            }
        }
        avgHeight /= quantity;

        return avgHeight;

    }

    public static double getAvgHeightForMen(Pessoa[] vector) {

        double avgHeight = 0.0;
        int quantity = 0;
        for (int i = 0; i < vector.length; i++) {

            if (vector[i].getSex() == 'M') {

                avgHeight += vector[i].getHeight();
                quantity++;


            }

        }
        avgHeight /= quantity;

        return avgHeight;

    }

}
