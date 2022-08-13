package com.example.services;

import com.example.models.NotifiableProduct;
import com.example.models.Product;
import com.example.repositories.NotifiableProductRepository;

import java.util.List;

public class NotifiableProductService {
    private final NotifiableProductRepository NOTIFIABLE_PRODUCT_REPOSITORY = new NotifiableProductRepository();

    public List<NotifiableProduct> getAll() {
        return NOTIFIABLE_PRODUCT_REPOSITORY.getAll();
    }

    public int sendAllNotifications() {
        int notifications = 0;
        for (Product product : NOTIFIABLE_PRODUCT_REPOSITORY.getAll()) {
            //sending some notifications here
            notifications++;
        }
        return notifications;
    }

    public void save(NotifiableProduct product) {
        NOTIFIABLE_PRODUCT_REPOSITORY.save(product);
    }
}
