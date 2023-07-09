package com.example.Ecommerce.API.controller;

import com.example.Ecommerce.API.model.Order;
import com.example.Ecommerce.API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("orderC")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("order/{id}")
    public Optional<Order> getOrder(@PathVariable Integer id){
        return orderService.getOrder(id);
    }
}
