package com.easyfii.easyfii.storeservice.controller;

import com.easyfii.easyfii.storeservice.entity.Store;
import com.easyfii.easyfii.storeservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping
    public ResponseEntity<Store> createStore(@RequestBody Store store) {
        return ResponseEntity.ok(storeService.createStore(store));
    }

    @PutMapping("/{storeId}/theme")
    public ResponseEntity<Store> updateTheme(@PathVariable Long storeId, @RequestBody String themeSettings) {
        return ResponseEntity.ok(storeService.updateTheme(storeId, themeSettings));
    }
}
