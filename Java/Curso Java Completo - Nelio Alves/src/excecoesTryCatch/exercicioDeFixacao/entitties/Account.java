package excecoesTryCatch.exercicioDeFixacao.entitties;

import excecoesTryCatch.exercicioDeFixacao.exceptions.IllegalDepositAmount;
import excecoesTryCatch.exercicioDeFixacao.exceptions.IllegalWithdrawAmount;

public class Account {

    private final Integer number;
    private final String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Double withdrawLimit, Double initialBalance, String holder, Integer number) {
        this.withdrawLimit = withdrawLimit;
        this.balance = initialBalance;
        this.holder = holder;
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) throws IllegalDepositAmount {
        if (amount.isInfinite() || amount <= 0.0) {
            throw new IllegalDepositAmount("Unable to deposit this amount: $ " + amount);
        } else {
            balance += amount;
        }

    }

    public void withDraw(Double amount) throws IllegalWithdrawAmount {
        if (amount.isInfinite() || amount <= 0.0) {
            throw new IllegalWithdrawAmount("Unable to withdraw this amount");
        } else if (amount > balance) {
            throw new IllegalWithdrawAmount("Not enough balance");
        } else if (amount > withdrawLimit) {
            throw new IllegalWithdrawAmount("The amount exceeds withdraw limit");
        } else {
            balance -= amount;
        }
    }

}
