package interfaces.minhaFixacao_Default;

import java.util.Locale;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);

        double amount = Double.parseDouble(IO.readln("Amount: "));
        int months = Integer.parseInt(IO.readln("Months: "));

        InterestService Brazil = new BrazilInterestService(2.0);
        InterestService USA = new UsaInterestService(1.0);

        IO.println("Payment after " + months + " months:");
        IO.println("In Brazil: " + String.format("%.2f", Brazil.payment(amount, months)));
        IO.println("In USA: " + String.format("%.2f", USA.payment(amount, months)));

    }
}
