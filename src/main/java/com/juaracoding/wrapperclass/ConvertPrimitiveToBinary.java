package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.44
@Last Modified 15/04/25 23.44
Version 1.0
*/

public class ConvertPrimitiveToBinary {
    public static void main(String[] args) {
        int num = 18;
        String binaryString = Integer.toBinaryString(num);
        System.out.println("Binary String of " + num + ": " + binaryString);
    }
}
