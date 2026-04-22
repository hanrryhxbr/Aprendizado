package EstruturasSequenciais.Exercicio1;

import java.util.Locale;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("""
                Products:
                %s, which price is $ %.2f
                %s, which price is $ %.2f
                
                Record: %d years old, code %d and gender: %c
                
                Measure with eight decimal places: %.8f
                """, product1, price1, product2, price2, age, code, gender, measure);


        BigDecimal arredondado = new BigDecimal(measure);
        arredondado = arredondado.setScale(3, RoundingMode.HALF_UP);

        DecimalFormat numeroFormatado = new DecimalFormat("###,###.000");

        System.out.println("Rounded ( three decimal places ): " + numeroFormatado.format(arredondado));

        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.3f", arredondado);

    }
}
