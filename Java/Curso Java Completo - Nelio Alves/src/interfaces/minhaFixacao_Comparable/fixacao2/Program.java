package interfaces.minhaFixacao_Comparable.fixacao2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    static void main() {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\romer\\Documents\\entrada.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }

            Collections.sort(list);
            for (Employee emp : list) {
                IO.println(emp.getName());
            }
        } catch (IOException e) {
            IO.println("Error" + e.getMessage());
        }

    }
}
