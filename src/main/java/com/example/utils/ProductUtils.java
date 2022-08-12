package com.example.utils;

import com.example.models.NotifiableProduct;
import com.example.models.ProductBundle;

import java.util.Random;

public class ProductUtils {

    public ProductBundle generateRandomProductBundle() {
        Random random = new Random();
        ProductBundle productBundle = new ProductBundle();
        productBundle.setAmount(random.nextInt(15));
        productBundle.setAvailable(random.nextBoolean());
        productBundle.setChannel(random.nextBoolean() + "" + random.nextDouble());
        productBundle.setPrice(random.nextDouble());
        productBundle.setId(random.nextLong());
        productBundle.setTitle(random.nextFloat() + "" + random.nextDouble());
        return productBundle;
    }

    public NotifiableProduct generateRandomNotifiableProduct() {
        Random random = new Random();
        NotifiableProduct product = new NotifiableProduct();
        product.setId(random.nextLong());
        product.setTitle(random.nextFloat() + "" + random.nextDouble());
        product.setAvailable(random.nextBoolean());
        product.setChannel(random.nextBoolean() + "" + random.nextDouble());
        product.setPrice(random.nextDouble());
        return product;
    }
}
