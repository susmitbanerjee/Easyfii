package com.easyfii.easyfii.orderservice.entity;

import com.easyfii.easyfii.productservice.entity.Product;
import com.easyfii.easyfii.userservice.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "orders")
@Getter
@Setter
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private User customer;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private Integer quantity;
    private Double totalAmount;
    private String status; // PENDING, CONFIRMED, DELIVERED

}

