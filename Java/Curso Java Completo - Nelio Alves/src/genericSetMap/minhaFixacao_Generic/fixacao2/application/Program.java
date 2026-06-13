package genericSetMap.minhaFixacao_Generic.fixacao2.application;

import genericSetMap.minhaFixacao_Generic.fixacao2.entities.Product;
import genericSetMap.minhaFixacao_Generic.fixacao2.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "c:\\Users\\romer\\documents\\in.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line =  br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                Product product = new Product(fields[0], Double.parseDouble(fields[1]));
                list.add(product);
                line = br.readLine();
            }

            Product max = CalculationService.max(list);
            IO.println("MAX: " + max.getName());
            IO.println("PRICE: " + max.getPrice());
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
