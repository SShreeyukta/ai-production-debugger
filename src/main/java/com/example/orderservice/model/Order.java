package com.example.orderservice.model;

import java.time.LocalDateTime;

public class Order {

    private Long id;
    private String productId;
    private int quantity;
    private String status;
    private LocalDateTime createdAt;


    public Order(Long id, String productId, int quantity, String status, LocalDateTime createdAt) {
        this.id = id;
        this.productId = productId;
        this.quantity = quantity;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
