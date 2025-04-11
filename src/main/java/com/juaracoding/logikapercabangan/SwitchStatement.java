package com.juaracoding.logikapercabangan;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 11/04/25 07.34
@Last Modified 11/04/25 07.34
Version 1.0
*/

public class SwitchStatement {

    public static void main(String[] args) {
        char predicate = 'A';

        switch (predicate) {
            case 'A':
                System.out.println("Your predicate is very good");
                break;

            case 'B':
                System.out.println("Your predicate is good");
                break;

            case 'C':
                System.out.println("Your predicate is enough");
                break;

            case 'D':
                System.out.println("Your predicate is less");
                break;

            default:
                System.out.println("You didn't pass the predicate");
        }

    }

}
