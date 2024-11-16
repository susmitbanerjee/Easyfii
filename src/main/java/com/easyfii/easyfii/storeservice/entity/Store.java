package com.easyfii.easyfii.storeservice.entity;

import com.easyfii.easyfii.userservice.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "stores")
@Getter
@Setter
@ToString
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String storeName;

    @Column(nullable = false, unique = true)
    private String subdomain; // e.g., username.myshop.com

    private String themeSettings;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

}

