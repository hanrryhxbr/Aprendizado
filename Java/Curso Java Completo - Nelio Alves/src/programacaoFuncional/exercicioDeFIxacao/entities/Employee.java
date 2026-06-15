package programacaoFuncional.exercicioDeFIxacao.entities;

public class Employee {

    String name;
    String email;
    Double salary;

    public Employee() {
    }

    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }
}
