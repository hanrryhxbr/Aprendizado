package memoriaArraysListas.exerciciosDeFixacao.exercicioListas;

public class Employee {

    public final Integer id;
    public final String name;
    public Double salary;

    public Employee(Integer id, String name, Double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public void increseSalary(double percentage) {

        this.salary *= 1 + (percentage / 100);

    }

    public String toString() {

        return id + ", " + name + ", " + String.format("%.2f", salary);

    }

    public Integer getId() {
        return id;
    }
}
