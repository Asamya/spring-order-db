package de.bernhardscholz.supershop.orderdb.orderdb.service;

import de.bernhardscholz.supershop.orderdb.orderdb.Db.OrderDb;
import de.bernhardscholz.supershop.orderdb.orderdb.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Order addOrderToList(Order order) {
        return orderDb.addOrderToList(order);
    }
}
