package com.example.services;

import com.example.models.ProductBundle;
import com.example.repositories.ProductBundleRepository;

import java.util.List;

public class ProductBundleService {
    private final ProductBundleRepository PRODUCT_BUNDLE_REPOSITORY = new ProductBundleRepository();

    public List<ProductBundle> getAll() {
        return PRODUCT_BUNDLE_REPOSITORY.getAll();
    }

    public void save(ProductBundle product) {
        PRODUCT_BUNDLE_REPOSITORY.save(product);
    }
}
