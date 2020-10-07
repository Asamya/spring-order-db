package de.bernhardscholz.supershop.orderdb.orderdb.controller;

import de.bernhardscholz.supershop.orderdb.orderdb.model.Product;
import de.bernhardscholz.supershop.orderdb.orderdb.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductControllerTest {

    private final Product listOfProduct = new Product(List.of(
            new Product("some-id", "first-product"),
            new Product("new-id", "second product")
    ));

    private final ProductService productServiceMock = mock(ProductService.class);
    private final ProductController testController = new ProductController(productServiceMock);

    @Test
    void testIfListOfProductsComeBackToController() {
        //When
        when(productServiceMock.listOfProducts(listOfProduct)).
                thenReturn(listOfProduct);

        Product actual = testController.

    }

    @Test
    void getProductById() {
    }
}