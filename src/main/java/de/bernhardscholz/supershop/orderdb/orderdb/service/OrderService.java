package de.bernhardscholz.supershop.orderdb.orderdb.service;

import de.bernhardscholz.supershop.orderdb.orderdb.Db.OrderDb;
import de.bernhardscholz.supershop.orderdb.orderdb.model.Order;
import de.bernhardscholz.supershop.orderdb.orderdb.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private final OrderDb orderDb;

    public OrderService(OrderDb orderDb) {
        this.orderDb = orderDb;
    }


    public List<Order> listOfOrders() {
        return orderDb.listOfOrders();
    }

    public Optional<Order> getOrderById(String orderId) {
        return orderDb.getOrderById(orderId);
    }

    public Order createOrder(List<Product> orderProducts) {
        for (Product product : orderProducts) {
            if (product.getId().isEmpty() && product.getProductName().isEmpty()) {
                throw new IllegalArgumentException("product" + product + "not found.");
            }
        }
        String id = UUID.randomUUID().toString();
        Order newOrder = new Order(id, orderProducts);
        this.orderDb.createOrder(orderProducts);
        return newOrder;
    }
}
