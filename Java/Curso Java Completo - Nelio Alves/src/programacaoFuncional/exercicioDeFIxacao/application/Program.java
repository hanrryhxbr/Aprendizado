package programacaoFuncional.exercicioDeFIxacao.application;

import programacaoFuncional.exercicioDeFIxacao.entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {
    void main() {

        Locale.setDefault(Locale.US);

        File file = new File(IO.readln("Enter full file path: "));
        boolean fileExists = file.exists();

        while (!fileExists) {
            file = new File(IO.readln("This file does not exist! Please a valid file path: "));
            fileExists = file.exists();
        }

        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file.getPath()))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Employee emp = new Employee(fields[0], fields[1], Double.parseDouble(fields[2]));
                employees.add(emp);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            IO.println("Error" + e.getMessage());
        }

        double salaryBound = Double.parseDouble(IO.readln("Enter salary: "));
        IO.println("Email of those whose salary is higher than " + String.format("%.2f", salaryBound) + ":");
        employees.stream().
                filter(p -> p.getSalary() > salaryBound).
                map(Employee::getEmail).sorted().forEach(System.out::println);

        double filteredSalarySum = employees.stream().
                filter(emp -> emp.getName().startsWith("M")).
                mapToDouble(Employee::getSalary).
                sum();
        IO.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", filteredSalarySum));
    }
}
