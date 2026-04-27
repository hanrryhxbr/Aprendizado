package introPOO.exerciciosDeFixacao_NoStatic.exercicio2;

public class Employee {

    String name;
    double grossSalary;
    double tax;

    public double netSalary() {

        return this.grossSalary - this.tax;

    }

    public void increaseSalary(double percentage) {

        this.grossSalary += this.grossSalary * (percentage/100);

    }
}
