package interfaces.exercicioDeFixacao.model.services;

public class PaypalPaymentService implements PaymentService{

    @Override
    public double generateInstallmentPrice(double installmentPrice, int installmentMonth) {
        double monthlyFeePrice = installmentPrice * (1 + (0.01 * installmentMonth));
        return monthlyFeePrice * (1 + 0.02);
    }
}
