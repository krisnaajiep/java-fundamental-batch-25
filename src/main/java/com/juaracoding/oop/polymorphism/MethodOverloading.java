package com.juaracoding.oop.polymorphism;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 03.37
@Last Modified 16/04/25 03.37
Version 1.0
*/

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(20.45, 73.55));
        System.out.println(calculator.add(55, 30, 28));
    }
}

/**
 * Method overloading
 * memiliki nama method yang sama tetapi dengan parameter atau tipe data yang berbeda.
 * Terjadi pada waktu compile
 */
class Calculator {
    /**
     * Method pertama
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Method kedua (overloading) - tipe data dan parameter berbeda
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Method ketiga (overloading) - jumlah parameter berbeda
     */
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
