package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.48
@Last Modified 15/04/25 23.48
Version 1.0
*/

public class MathematicalMethod {
    public static void main(String[] args) {
        int a = 1504930294;
        int b = 1420495830;
        int max = Integer.max(a, b);
        int min = Integer.min(a, b);
        long sum = Long.sum(a, b);
        System.out.println("int max: " + max);
        System.out.println("int min: " + min);
        System.out.println("long sum: " + sum);
    }
}
