package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.46
@Last Modified 15/04/25 23.46
Version 1.0
*/

public class ConvertPrimitiveToHex {
    public static void main(String[] args) {
        int num = 18;
        String hexString = Integer.toHexString(num);
        System.out.println("Hex String of " + num + ": " + hexString);
    }
}
