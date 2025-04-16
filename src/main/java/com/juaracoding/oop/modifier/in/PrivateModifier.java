package com.juaracoding.oop.modifier.in;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 02.04
@Last Modified 16/04/25 02.04
Version 1.0
*/

import java.time.LocalDate;

/**
 * private modifier
 * berarti properti atau metode hanya dapat diakses di class yang sama
 */
public class PrivateModifier {

    /**
     * private attribute
     */
    private int age;
    private int yearOfBirth;

    private void set(int age) {
        this.age = age;
        this.yearOfBirth = getYearOfBirth(age);
    }

    /**
     * private method
     */
    private int getYearOfBirth(int age) {
        return LocalDate.now().minusYears(age).getYear();
    }

    public static void main(String[] args) {
        // private dapat diakses karena di dalam class yang sama
        PrivateModifier privateModifier = new PrivateModifier();
        privateModifier.set(26);
        System.out.println("Age: " + privateModifier.age); // output: 26
        System.out.println("Date of Birth: " + privateModifier.yearOfBirth); // output: 1999
    }
}
