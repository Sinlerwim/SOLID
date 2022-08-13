package com.example.models;

import lombok.Setter;

@Setter
public class ProductBundle extends Product {
    protected int amount;

    public int getAmountInBundle() {
        return amount;
    }

    public String toString() {
        return "ProductBundle{" +
                "channel='" + channel + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", amountInBundle=" + amount +
                '}';
    }
}