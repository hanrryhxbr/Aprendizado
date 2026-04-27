package memoriaArraysListas.exerciciosDeFixacao.exercicioListas;

import java.util.*;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Employee #" + (i+1));

            System.out.print("Id: ");
            int id = input.nextInt();
/*
            ALTERNATIVAMENTE( "correção" ):

            while (hasId(employees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = input.nextInt();
            }
*/

            System.out.print("Name: ");
            String name = input.next();

            System.out.print("Salary: ");
            double salary = input.nextDouble();

            employees.add(new Employee(id, name, salary));

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increse: ");
        Integer id = input.nextInt();
        boolean find = false;

        for (Employee employee : employees) {

            if (Objects.equals(employee.getId(), id)) {

                System.out.print("Enter the percentage: ");
                double percentageIncrease = input.nextDouble();

                employee.increseSalary(percentageIncrease);

                find = true;

                break;
            }

        }

        if (!find) {

            System.out.println("This id does not exist!");

        }

/*
        ALTERNATIVAMENTE( "correção" ):

        Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            emp.increaseSalary(percentage);
        }
*/

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : employees) {

            System.out.println(employee.toString());

        }

        input.close();

    }

    /*
            ALTERNATIVAMENTE( "correção" ):

            public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
*/

}
