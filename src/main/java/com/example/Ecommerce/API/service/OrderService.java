package com.example.Ecommerce.API.service;

import com.example.Ecommerce.API.model.Order;
import com.example.Ecommerce.API.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public Order createOrder(Order order) {
        return iOrderRepo.save(order);
    }

    public Optional<Order> getOrder(Integer id) {
        return iOrderRepo.findById(id);
    }
}
