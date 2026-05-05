package herancaPolimorfismo.exercicioDeFixacao.application;

import herancaPolimorfismo.exercicioDeFixacao.entities.ImportedProduct;
import herancaPolimorfismo.exercicioDeFixacao.entities.Product;
import herancaPolimorfismo.exercicioDeFixacao.entities.UsedProduct;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
//import java.util.Scanner;

public class Program {
    void main() {

        Locale.setDefault(Locale.US);
        //Scanner input = new Scanner(System.in);
        //Vou usar os recursos IO

        int n = Integer.parseInt(IO.readln("Enter the number of products: "));
        List<Product> products = new ArrayList<>();

        for (int i = 1 ; i <= n ; i++) {
            IO.println("Enter product #" + i + " data:");
            char productType = IO.readln("Common, used or imported (c/u/i)? ").toLowerCase().charAt(0);
            String name = IO.readln("Name: ");
            Double price = Double.valueOf(IO.readln("Price: "));
            if (productType == 'u') {
                LocalDate manufactureDate = LocalDate.parse(IO.readln("Manufacture date (DD/MM/YYYY): "), UsedProduct.DATE_TIME_FORMATTER);
                products.add(new UsedProduct(name, price, manufactureDate));
            } else if (productType == 'i') {
                Double customFee = Double.valueOf(IO.readln("Custom fee: "));
                products.add(new ImportedProduct(name, price, customFee));
            } else {
                products.add(new Product(name, price));
            }
        }

        IO.println("\nPRICE TAGS:");
        for (Product p : products) {
            IO.println(p.priceTag());
        }
    }
}
