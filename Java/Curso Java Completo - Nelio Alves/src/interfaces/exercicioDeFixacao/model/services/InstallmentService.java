package interfaces.exercicioDeFixacao.model.services;

import interfaces.exercicioDeFixacao.model.entitties.Installment;

import java.time.LocalDate;
import java.util.ArrayList;

public class InstallmentService {

    private double contractValue;
    private PaymentService paymentService;

    public InstallmentService(double contractValue, PaymentService paymentService) {
        this.contractValue = contractValue;
        this.paymentService = paymentService;
    }

    public ArrayList<Installment> createInstallments(LocalDate startingDate, int monthsForPayment) {
        double basicPrice = contractValue / monthsForPayment;
        ArrayList<Installment> installmentsList = new ArrayList<>();

        for (int i = 0; i < monthsForPayment; i++) {
            double installmentPrice = paymentService.generateInstallmentPrice(basicPrice, i+1);
            Installment installment = new Installment(installmentPrice, startingDate.plusMonths(i+1));
            installmentsList.add(installment);
        }
        return installmentsList;
    }
}
