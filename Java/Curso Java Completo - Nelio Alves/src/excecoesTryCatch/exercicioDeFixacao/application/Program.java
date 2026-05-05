package excecoesTryCatch.exercicioDeFixacao.application;

import excecoesTryCatch.exercicioDeFixacao.entitties.Account;
import excecoesTryCatch.exercicioDeFixacao.exceptions.IllegalWithdrawAmount;

import java.util.Locale;

public class Program {
    void main() {

        Locale.setDefault(Locale.US);
        IO.println("Enter account data: ");
        int accountNumber;
        String accountHolder;
        double accountInitialBalance;
        double accountWithdrawLimit;

        while (true) {
            try {
                accountNumber = Integer.parseInt(IO.readln("Number: "));
                accountHolder = IO.readln("Holder: ");
                if (!accountHolder.matches("[a-zA-Z]+")) {
                    throw new RuntimeException();
                }
                accountInitialBalance = Double.parseDouble(IO.readln("Initial balance: "));
                accountWithdrawLimit = Double.parseDouble(IO.readln("Withdraw limit: "));
                break;
            }
            catch (RuntimeException e) {
                IO.println("Enter only expected values!");
            }
        }

        Account account = new Account(accountWithdrawLimit, accountInitialBalance, accountHolder, accountNumber);

        while (true) {
            try {
                double withdrawAmount = Double.parseDouble(IO.readln("Enter amount for withdraw: "));
                account.withDraw(withdrawAmount);
                break;
            }
            catch (IllegalWithdrawAmount e) {
                IO.println("Error: " + e.getMessage());
                IO.println("Enter a valid withdraw amount");
            }
            catch (RuntimeException e) {
                IO.println("Error: " + e.getMessage());
                IO.println("Enter a valid withdraw amount( your withdraw limit is $ " + String.format("%.2f", account.getWithdrawLimit()));
            }
        }

        IO.println("New balance: " + String.format("%.2f", account.getBalance()));

    }
}
