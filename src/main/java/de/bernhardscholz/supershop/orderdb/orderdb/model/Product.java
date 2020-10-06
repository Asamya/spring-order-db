package de.bernhardscholz.supershop.orderdb.orderdb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    public String id;
    public String productName;

}
