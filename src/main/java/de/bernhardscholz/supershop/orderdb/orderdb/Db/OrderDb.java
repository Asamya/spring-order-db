package de.bernhardscholz.supershop.orderdb.orderdb.Db;

import de.bernhardscholz.supershop.orderdb.orderdb.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderDb {

    public final ArrayList<Order> orders = new ArrayList<>();

    public List<Order> listOfOrders() {
        return orders;
    }

    public Optional<Order> getOrderById(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)){
                return Optional.of(order);
            }
        }
        return Optional.empty();
    }

    public Order addOrderToList(Order order) {
        orders.add(order);
        return order;
    }
}
