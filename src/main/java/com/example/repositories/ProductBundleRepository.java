package com.example.repositories;

import com.example.models.NotifiableProduct;
import com.example.models.Product;
import com.example.models.ProductBundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductBundleRepository implements ProductRepository<ProductBundle> {
    private final Map<Long, ProductBundle> STORAGE = new HashMap<>();

    public void save(ProductBundle product) {
        STORAGE.put(product.getId(), product);
    }

    public List<ProductBundle> getAll() {
        return new ArrayList<>(STORAGE.values());
    }
}
