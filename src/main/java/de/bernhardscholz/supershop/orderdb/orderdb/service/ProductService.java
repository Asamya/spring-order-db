package de.bernhardscholz.supershop.orderdb.orderdb.service;

import de.bernhardscholz.supershop.orderdb.orderdb.Db.ProductDb;
import de.bernhardscholz.supershop.orderdb.orderdb.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    public final ProductDb productDb;

    public ProductService(ProductDb productDb) {
        this.productDb = productDb;
    }

    public List<Product> listOfProducts() {
        return productDb.listOfProducts();
    }

    public Optional<Product> getProductById(String id) {
        return productDb.getProductById(id);
    }
}
