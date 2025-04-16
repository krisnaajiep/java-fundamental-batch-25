package com.juaracoding.oop.constructor;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 02.57
@Last Modified 16/04/25 02.57
Version 1.0
*/


/**
 * Constructor Overloading
 * Class berikut memiliki 2 constructor dengan parameter yang berbeda
 */
public class ConstructorOverloading {
    static String port;
    static String user;
    static String pass;
    static String name;

    public ConstructorOverloading(String port, String user, String pass) {
        ConstructorOverloading.port = port;
        ConstructorOverloading.user = user;
        ConstructorOverloading.pass = pass;
    }

    public ConstructorOverloading(String port, String user, String pass, String name) {
        ConstructorOverloading.port = port;
        ConstructorOverloading.user = user;
        ConstructorOverloading.pass = pass;
        ConstructorOverloading.name = name;
    }
}
