package de.bernhardscholz.supershop.orderdb.orderdb.controller;

import de.bernhardscholz.supershop.orderdb.orderdb.model.Order;
import de.bernhardscholz.supershop.orderdb.orderdb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> listOfOrders(){
        return orderService.listOfOrders();
    }

    @GetMapping("{orderId}")
    public Order getOrderById(@PathVariable String orderId){
        Optional<Order> newOrder = orderService.getOrderById(orderId);
        if (newOrder.isPresent()) {
            return newOrder.get();
        }
        throw new ResponseStatusException(HttpStatus.I_AM_A_TEAPOT);
    }


}
