package interfaces.exercicioDeFixacao.model.entitties;

import java.time.LocalDate;

public class Installment {

    private final double value;
    private final LocalDate paymentDate;

    public Installment(double value, LocalDate paymentDate) {
        this.value = value;
        this.paymentDate = paymentDate;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }
}
