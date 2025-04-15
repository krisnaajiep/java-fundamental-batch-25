package com.juaracoding.wrapperclass;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 15/04/25 23.35
@Last Modified 15/04/25 23.35
Version 1.0
*/

public class ParsingStringToPrimitive {
    public static void main(String[] args) {
        // Parsing String to int
        String intString = "153450500";
        int intValue = Integer.parseInt(intString);
        System.out.println("Parsing String to int:");
        System.out.println("String value: " + intString);
        System.out.println("int value: " + intValue);

        System.out.println();

        // Parsing String to double
        String doubleString = "124.504930D";
        double doubleValue = Double.parseDouble(doubleString);
        System.out.println("Parsing String to double:");
        System.out.println("String value: " + doubleString);
        System.out.println("double value: " + doubleValue);

        System.out.println();

        // Parsing String to boolean
        String booleanString = "true";
        boolean booleanValue = Boolean.parseBoolean(booleanString);
        System.out.println("Parsing String to boolean:");
        System.out.println("String value: " + booleanString);
        System.out.println("boolean value: " + booleanValue);

        System.out.println();

        // Parsing String to char
        String charString = "a";
        char charValue = charString.charAt(0);
        System.out.println("Parsing String to char:");
        System.out.println("String value: " + charString);
        System.out.println("char value: " + charValue);
    }
}
