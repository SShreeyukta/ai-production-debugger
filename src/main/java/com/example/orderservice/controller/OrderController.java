package com.example.orderservice.controller;

import com.example.orderservice.dto.CreateOrderRequest;
import com.example.orderservice.model.Order;
import com.example.orderservice.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    //@Valid tells Spring validate this request object before passing into my controller method
    //We don't want garbage data entering our business logic
    public Order createOrder(@Valid @RequestBody CreateOrderRequest request){
        return orderService.createOrder(request);
    }

    @GetMapping("/health")
    public String health(){
        return "Order service is healthy";
    }
}
