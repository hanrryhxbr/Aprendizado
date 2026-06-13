package interfaces.minhaFixacao_Default;

public class BrazilInterestService implements InterestService{

    double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
