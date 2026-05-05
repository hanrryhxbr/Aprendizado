package herancaPolimorfismo.exercicioDeFixacao_ABSTRACT.entities;

public class LegalEntity extends TaxPayer{

    private Integer employees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double taxes() {
        if (getEmployees() <= 10) {
            return getAnnualIncome() * 0.16;
        } else {
            return getAnnualIncome() * 0.14;
        }
    }
}
