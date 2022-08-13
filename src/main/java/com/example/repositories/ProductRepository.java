package com.example.repositories;

import com.example.models.Product;

import java.util.List;

public interface ProductRepository<T extends Product> {
    void save(T product);

    List<T> getAll();
}
