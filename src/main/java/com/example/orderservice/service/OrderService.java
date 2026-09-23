package com.example.orderservice.service;

import com.example.orderservice.dto.CreateOrderRequest;
import com.example.orderservice.model.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class OrderService {

    private final AtomicLong idGenerator = new AtomicLong(0);

    public Order createOrder(CreateOrderRequest request){

        Long id = idGenerator.incrementAndGet();

        return new Order(id, request.getProductId(),request.getQuantity(), "CREATED", LocalDateTime.now());
    }
}
