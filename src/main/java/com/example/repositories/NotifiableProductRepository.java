package com.example.repositories;

import com.example.models.NotifiableProduct;
import com.example.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotifiableProductRepository implements ProductRepository<NotifiableProduct> {

    private final Map<Long, NotifiableProduct> STORAGE = new HashMap<>();

    public void save(NotifiableProduct product) {
        STORAGE.put(product.getId(), product);
    }

    public List<NotifiableProduct> getAll() {
        return new ArrayList<>(STORAGE.values());
    }
}
