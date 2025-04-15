package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.28
@Last Modified 15/04/25 23.28
Version 1.0
*/

import java.util.Random;

public class Unboxing {
    public static void main(String[] args) {
        // wrapper class to primitive
        Integer randomInteger = new Random().nextInt();
        int randomInt = randomInteger;
        System.out.print("randomInt: ");
        System.out.println(randomInt);
    }
}
