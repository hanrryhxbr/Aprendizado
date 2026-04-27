package introPOO.exerciciosDeFixacao_Static.exercicio1;

public class CurrencyConverter {

    public static double toDolar(double cotation, double quantity) {

        return cotation * quantity;

    }

    public static double iofSumQuantity(double percentage, double value) {

        return value * (percentage/100);

    }

    public static double toDolarWithIof(double cotation, double quantity, double percentage) {

        double aux =  CurrencyConverter.toDolar(cotation, quantity);
        return aux + CurrencyConverter.iofSumQuantity(percentage, aux);

    }
}
