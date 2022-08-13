package com.example;

import com.example.services.NotifiableProductService;
import com.example.services.ProductBundleService;
import com.example.utils.ProductUtils;

public class Main {

    private static final ProductUtils UTILS = new ProductUtils();
    private static final NotifiableProductService NOTIFIABLE_PRODUCT_SERVICE = new NotifiableProductService();
    private static final ProductBundleService PRODUCT_BUNDLE_SERVICE = new ProductBundleService();


    public static void main(String[] args) {

        for (int i = 0; i<5; i++) {
            NOTIFIABLE_PRODUCT_SERVICE.save(UTILS.generateRandomNotifiableProduct());
            PRODUCT_BUNDLE_SERVICE.save(UTILS.generateRandomProductBundle());
        }
        System.out.println(NOTIFIABLE_PRODUCT_SERVICE.getAll());
        System.out.println(PRODUCT_BUNDLE_SERVICE.getAll());
        System.out.println("notifications sent: " + NOTIFIABLE_PRODUCT_SERVICE.sendAllNotifications());
    }
}
