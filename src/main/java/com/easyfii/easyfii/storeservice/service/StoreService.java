package com.easyfii.easyfii.storeservice.service;

import com.easyfii.easyfii.storeservice.entity.Store;
import com.easyfii.easyfii.storeservice.repo.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public Store createStore(Store store) {
        if (storeRepository.findBySubdomain(store.getSubdomain()).isPresent()) {
            throw new RuntimeException("Subdomain already exists!");
        }
        return storeRepository.save(store);
    }

    public Store updateTheme(Long storeId, String themeSettings) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new RuntimeException("Store not found!"));
        store.setThemeSettings(themeSettings);
        return storeRepository.save(store);
    }
}

