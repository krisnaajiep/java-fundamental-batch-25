package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.26
@Last Modified 15/04/25 23.26
Version 1.0
*/

public class Autoboxing {
    public static void main(String[] args) {
        // primitive to wrapper class
        long currentTimeMillis = System.currentTimeMillis();
        Long currentTimeMillisLong = currentTimeMillis;
        System.out.print("currentTimeMillisLong: ");
        System.out.println(currentTimeMillisLong);
    }
}
