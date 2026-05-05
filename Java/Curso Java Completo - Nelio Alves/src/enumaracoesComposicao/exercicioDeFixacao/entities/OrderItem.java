package enumaracoesComposicao.exercicioDeFixacao.entities;

public class OrderItem {

    private final Integer quantity;
    private final Double price;

    private final Product product;

    public OrderItem(Integer quantity, Double price, String name) {

        this.quantity = quantity;
        this.price = price;
        this.product = new Product(name, price);

    }

    public Integer getQuantity() {

        return quantity;

    }

    public Double getPrice() {

        return price;

    }

    public String getProduct() {

        return product.getName();

    }

    public double subTotal() {

        return quantity * price;


    }

}
