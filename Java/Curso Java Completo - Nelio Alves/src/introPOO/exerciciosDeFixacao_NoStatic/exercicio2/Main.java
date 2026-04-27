package introPOO.exerciciosDeFixacao_NoStatic.exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: ");
        employee.tax = input.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(input.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.netSalary());

    }
}
