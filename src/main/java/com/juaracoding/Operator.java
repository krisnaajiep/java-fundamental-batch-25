package com.juaracoding;

/*
IntelliJ IDEA 2024.3.4.1 (Community Edition)
Build #IC-243.25659.59, built on March 5, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 08/04/25 19.20
@Last Modified 08/04/25 19.20
Version 1.0
*/

public class Operator {
    public static void main(String[] args) {

        System.out.println("Arithmetic Operator:");

        // Multiple Operator (*)
        System.out.println("\nMultiple Operator:");
        double price = 11750;
        double amount = 2;
        double subTotal = amount * price;
        System.out.println(subTotal);

        // Modulus Operator (%)
        System.out.println("\nModulus Operator:");
        System.out.println(5 % 2);

        // Increment and Decrement Operators ( ++ / -- )
        System.out.println("\nIncrement and Decrement Operators: ");
        int x = 2;
        // x++;
        int num1 = 10 * x++; // Suffix
        System.out.println(num1 + x); // 20 + 3

        int y = 2;
        int num2 = 10 * ++y; // Prefix
        System.out.println(num2); // 30

        // Operator Precedence
        System.out.println("\nOperator Precedence:");
        int result = (10 + 5) * 6;
        System.out.println(result); // 60

        // Arithmetic + Assignment Operator
        System.out.println("\nAssignment Operator:");
        int a = 10;
        int b = 5;
        a += b;
        System.out.println(a); // a(10) + b(5) = 15

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println(5 < 5); // false
        System.out.println(5 <= 5); // true
        System.out.println(-2 < -3); // false
        System.out.println(0 > -18); // true

        // Bitwise Operator
        System.out.println("\nBitwise Operator:");
        /**
         * 18 & 14 (AND)
         *
         * 18 / 2 = 9, 18 % 2 = 0
         * 9 / 2 = 4, 9 % 2 = 1
         * 4 / 2 = 2, 3 % 2 = 0
         * 2 / 2 = 1, 2 % 2 = 0
         * 1 / 2 = 0, 1 % 2 = 1
         * 18 = 10010
         *
         * 14 / 2 = 7, 14 % 2 = 0
         * 7 / 2 = 3, 7 % 2 = 1
         * 3 / 2 = 1, 3 % 2 = 1
         * 1 / 2 = 0, 1 % 2 = 1
         * 14 = 1110
         *
         * 10010 & 1110
         *
         * 10010
         * 01110
         * -----
         * 00010
         *
         * 0 * 2^4 = 0
         * 0 * 2^3 = 0
         * 0 * 2^2 = 0
         * 1 * 2^1 = 2
         * 0 * 2^0 = 0
         *
         * 0 + 0 + 0 + 0 + 2 + 0 = 2
         */
        System.out.println(18 & 14); // 2
    }
}
