package genericSetMap.minhaFixacao_Generic.fixacao2.entities;

public class Product implements Comparable<Product>{

    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }
}
