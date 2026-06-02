package interfaces.exercicioDeFixacao.model.entitties;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {

    private Integer number;
    private LocalDate contractDate;
    private Double contractValue;
    private ArrayList<Installment> installments;

    public Contract() {
    }

    public Contract(Integer number, LocalDate contractDate, Double contractValue) {
        this.number = number;
        this.contractDate = contractDate;
        this.contractValue = contractValue;
    }

    public ArrayList<Installment> getInstallments() {
        return installments;
    }

    public void addInstallments(ArrayList<Installment> installments) {
        this.installments = installments;
    }
}
