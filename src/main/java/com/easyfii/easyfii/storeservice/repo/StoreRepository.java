package com.easyfii.easyfii.storeservice.repo;

import com.easyfii.easyfii.storeservice.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    Optional<Store> findBySubdomain(String subdomain);
}

