package construtoresThisSobrecargaEncapsulamento.exercicioDeFIxacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = input.nextInt();

        System.out.print("Enter account holder: ");
        String holder = input.next();

        System.out.print("Is there na initial deposit (y/n)? ");
        char confirmation = input.next().charAt(0);

        if (confirmation == 'y') {

            System.out.print("Enter initial deposit value: ");
            double deposit = input.nextDouble();

            account = new Account(number, holder, deposit);

        } else {

            account = new Account(number, holder);
        }

        System.out.printf("""
                Account data:
                %s
                """,account.toString());

        System.out.print("Enter a deposit value: ");
        account.deposit(input.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account.toString());

        System.out.print("Enter a withdraw value: ");
        account.withdraw(input.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account.toString());

    }

}
