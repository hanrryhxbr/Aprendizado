package enumaracoesComposicao.exercicioDeFixacao.application;

import enumaracoesComposicao.exercicioDeFixacao.entities.Client;
import enumaracoesComposicao.exercicioDeFixacao.entities.Order;
import enumaracoesComposicao.exercicioDeFixacao.entities.OrderItem;
import enumaracoesComposicao.exercicioDeFixacao.entities.enumerator.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    void main() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        IO.println("Enter client data");
        IO.print("Name: ");
        String clientName = input.nextLine();
        IO.print("Email: ");
        String clientEmail = input.nextLine();
        IO.print("Birthday: ");
        LocalDate clientBirthday = LocalDate.parse(input.nextLine(), formatter);
        Client client = new Client(clientName, clientEmail, clientBirthday);

        IO.println("Enter order data: ");
        IO.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(input.nextLine());
        IO.print("How many items in this order?  ");
        int itemQuantity = input.nextInt();

        Order order = new Order(client, orderStatus, LocalDateTime.now());

        for (int i = 0; i < itemQuantity; i++) {

            IO.println("Enter #" + (1 + i) + " item data:");
            IO.print("Product name: ");
            input.nextLine();
            String productName = input.nextLine();
            IO.print("Product price: ");
            double productPrice = input.nextDouble();
            IO.print("Quantity: ");
            int productQuantity = input.nextInt();

            OrderItem item = new OrderItem(productQuantity, productPrice, productName);

            order.addItem(item);

        }

        IO.println(order);

        input.close();

    }
}
