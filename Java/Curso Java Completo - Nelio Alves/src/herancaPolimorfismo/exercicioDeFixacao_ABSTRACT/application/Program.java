package herancaPolimorfismo.exercicioDeFixacao_ABSTRACT.application;

import herancaPolimorfismo.exercicioDeFixacao_ABSTRACT.entities.LegalEntity;
import herancaPolimorfismo.exercicioDeFixacao_ABSTRACT.entities.NaturalPerson;
import herancaPolimorfismo.exercicioDeFixacao_ABSTRACT.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    void main() {

        Locale.setDefault(Locale.US);
        //Vou usar recursos IO
        int n = Integer.parseInt(IO.readln("Enter the number of taxpayers: "));
        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 1 ; i <= n ; i++) {
            IO.println("Tax payer #" + i + " data:");
            char taxPayerType = IO.readln("Individual or company (i/c)? ").toLowerCase().charAt(0);
            String name = IO.readln("Name: ");
            Double annualIncome = Double.valueOf(IO.readln("Annual income: "));
            if (taxPayerType == 'i') {
                Double healthSpendings = Double.valueOf(IO.readln("Health expenditures: "));
                taxPayers.add(new NaturalPerson(name, annualIncome, healthSpendings));
            } else {
                Integer numberOfEmployees = Integer.parseInt(IO.readln("Number of employees: "));
                taxPayers.add(new LegalEntity(name, annualIncome, numberOfEmployees));
            }
        }

        IO.println("\nTAXES PAID: ");
        double totalTaxes = 0.0;
        for (TaxPayer t : taxPayers) {
            totalTaxes += t.taxes();
            IO.println(t.getName() + ": $ " + String.format("%.2f", t.taxes()));
        }

        IO.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
    }
}
