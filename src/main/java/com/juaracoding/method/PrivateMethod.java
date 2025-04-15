package com.juaracoding.method;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 04.31
@Last Modified 12/04/25 04.31
Version 1.0
*/

public class PrivateMethod {
    /**
     * Public method
     */
    public int getPrice(int quantity) {
        int price = 20000;
        return getPriceAfterDiscount(quantity * price);
    }

    /**
     * Private method
     */
    private int getPriceAfterDiscount(int price) {
        double discount = 0.5;
        return price - (int) (discount * price);
    }
}
