package com.juaracoding.oop.modifier.in;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 02.10
@Last Modified 16/04/25 02.10
Version 1.0
*/

/**
 * default / no-modifier
 * berarti kelas, properti, atau metode hanya dapat diakses di dalam package yang sama
 */
class NoModifier {
    /**
     * default attribute
     */
    String message;

    /**
     * default method
     */
    void printMessage() {
        System.out.println(message);
    }
}
