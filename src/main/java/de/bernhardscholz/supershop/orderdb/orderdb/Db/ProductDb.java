package de.bernhardscholz.supershop.orderdb.orderdb.Db;

import de.bernhardscholz.supershop.orderdb.orderdb.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductDb {

    public final ArrayList<Product> products = new ArrayList<Product>(List.of(
                        new Product("1","Superman"),
                        new Product("2","Superwoman"),
                        new Product("3", "Spiderman"),
                        new Product("4", "Hulk"),
                        new Product("5", "She-Hulk")
    ));


    public ArrayList<Product> listOfProducts() {
        return products;
    }

    public Optional<Product> getProductById(String id) {
        for (Product product : products){
            if (product.getId().equals(id)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
