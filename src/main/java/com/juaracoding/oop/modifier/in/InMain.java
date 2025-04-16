package com.juaracoding.oop.modifier.in;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 05.25
@Last Modified 16/04/25 05.25
Version 1.0
*/

public class InMain {
    public static void main(String[] args) {
        // no-modifier dapat diakses di dalam package yang sama
        NoModifier noModifier = new NoModifier();
        noModifier.message = "No Modifier";
        noModifier.printMessage();

        System.out.println("\nPrivate Modifier:");
        PrivateModifier privateModifier = new PrivateModifier();
        // error karena private
//        privateModifier.set(26);
//        System.out.println(privateModifier.age);
//        System.out.println(privateModifier.yearOfBirth);
//        System.out.println(privateModifier.getYearOfBirth());
    }
}
