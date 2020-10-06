package de.bernhardscholz.supershop.orderdb.orderdb.controller;

import de.bernhardscholz.supershop.orderdb.orderdb.model.Product;
import de.bernhardscholz.supershop.orderdb.orderdb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("products")
public class ProductController {

    public final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> listOfProducts(){
        return productService.listOfProducts();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable String id) {
        Optional<Product> product = productService.getProductById(id);
        //List<Product> newProducts = new ArrayList<>();
        if(product.isPresent()){
            //newProducts.add(product.get());
            return product.get();
        }
        throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
    }
}
