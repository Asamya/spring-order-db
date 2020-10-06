package de.bernhardscholz.supershop.orderdb.orderdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    public String orderId;
    public List<Product> orderedProducts;

}
