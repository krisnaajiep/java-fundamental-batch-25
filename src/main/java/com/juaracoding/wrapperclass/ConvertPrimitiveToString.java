package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.52
@Last Modified 15/04/25 23.52
Version 1.0
*/

public class ConvertPrimitiveToString {
    public static void main(String[] args) {
        double doublePi = Math.PI;
        String stringPi = Double.toString(doublePi);
        System.out.println("doublePi: " + (doublePi + 3));
        System.out.println("strinPi: " + (stringPi + 3));
    }
}
