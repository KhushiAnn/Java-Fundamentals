import java.util.*;
import java.util.stream.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 85000),
            new Product(2, "Phone", 35000),
            new Product(3, "Tablet", 25000),
            new Product(4, "Smartwatch", 15000)
        );

        List<String> expensiveProductNames = products.stream()
                .filter(p -> p.price > 30000)
                .map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println("Expensive Products: " + expensiveProductNames);
    }
}
