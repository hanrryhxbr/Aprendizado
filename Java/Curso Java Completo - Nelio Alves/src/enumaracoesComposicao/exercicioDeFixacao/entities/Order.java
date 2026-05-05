package enumaracoesComposicao.exercicioDeFixacao.entities;

import enumaracoesComposicao.exercicioDeFixacao.entities.enumerator.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private static final DateTimeFormatter formatterWithHours = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
    private final LocalDateTime moment;
    private final OrderStatus status;

    private final Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Client client, OrderStatus status, LocalDateTime moment) {
        this.client = client;
        this.status = status;
        this.moment = moment;

    }

    public String getMoment() {

        return formatterWithHours.format(moment);

    }

    public OrderStatus getStatus() {

        return status;

    }

    public Client getClient() {

        return client;

    }

    public void addItem(OrderItem item) {

        items.add(item);

    }

    public void removeItem(OrderItem item) {

        items.remove(item);

    }

    public Double total() {

        double sum = 0;
        for ( OrderItem item : items ) {

            sum += item.subTotal();

        }

        return sum;

    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: ").append(getMoment()).append("\n");
        sb.append("Order status: ").append(getStatus()).append("\n");
        sb.append("Client: ").append(client.getName()).append(" ").append(client.getBirthDate()).append(" - ").append(client.getEmail()).append("\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {

            sb.append(item.getProduct()).append(", $");
            sb.append(String.format("%.2f", item.getPrice()));
            sb.append(", Quantity: ").append(item.getQuantity()).append(", Subtotal: $");
            sb.append(String.format("%.2f", item.subTotal())).append("\n");

        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total())).append("\n");

        return sb.toString();
    }

}
