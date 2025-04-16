package com.juaracoding.oop.constructor;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 03.11
@Last Modified 16/04/25 03.11
Version 1.0
*/

public class ConstructorMain {
    public static void main(String[] args) {
        new ConstructorMethod("Hello", "World");
        System.out.println("attr1: " + ConstructorMethod.attr1);
        System.out.println("attr2" + ConstructorMethod.attr2);

        System.out.println();

        new ConstructorOverloading("3366", "root", "password");
        System.out.println("port: " + ConstructorOverloading.port);
        System.out.println("user: " + ConstructorOverloading.user);
        System.out.println("pass: " + ConstructorOverloading.pass);

        System.out.println();

        new ConstructorOverloading("3366", "root", "password", "ajie");
        System.out.println("port: " + ConstructorOverloading.port);
        System.out.println("user: " + ConstructorOverloading.user);
        System.out.println("pass: " + ConstructorOverloading.pass);
        System.out.println("name: " + ConstructorOverloading.name);
    }
}
