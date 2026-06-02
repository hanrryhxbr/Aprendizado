package interfaces.exercicioDeFixacao.model.services;

public interface PaymentService {

    double generateInstallmentPrice(double installmentValue, int installmentMonth);
}
