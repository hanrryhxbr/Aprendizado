package interfaces.exercicioDeFixacao.application;

import interfaces.exercicioDeFixacao.model.entitties.Contract;
import interfaces.exercicioDeFixacao.model.entitties.Installment;
import interfaces.exercicioDeFixacao.model.services.InstallmentService;
import interfaces.exercicioDeFixacao.model.services.PaypalPaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        IO.println("Enter the contract data:");
        int contractNumber = Integer.parseInt(IO.readln("Number: "));
        LocalDate contractDate = LocalDate.parse(IO.readln("Date (dd/MM/yyyy): "), fmt);
        double contractValue = Double.parseDouble(IO.readln("Contract value: "));

        Contract contract = new Contract(contractNumber, contractDate, contractValue);

        int installmentQuantity = Integer.parseInt(IO.readln("Enter the amount of installments: "));

        InstallmentService installmentService = new InstallmentService(contractValue, new PaypalPaymentService());

        contract.addInstallments(installmentService.createInstallments(contractDate, installmentQuantity));

        IO.println("Installments:");
        for (int i = 0; i < installmentQuantity; i++) {
            Installment installment = contract.getInstallments().get(i);
            IO.println(installment.getPaymentDate().format(fmt) + " - " + String.format("%.2f", installment.getValue()));

        }

    }
}
