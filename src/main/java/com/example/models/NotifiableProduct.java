package com.example.models;

import lombok.Setter;

@Setter
public class NotifiableProduct extends Product {

    public String generateAddressForNotification() {
        return "somerandommail@gmail.com";
    }

    public String toString() {
        return "NotifiableProduct{" +
                "channel='" + channel + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}