package com.juaracoding.oop.constructor;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 02.52
@Last Modified 16/04/25 02.52
Version 1.0
*/

public class ConstructorMethod {
    static String attr1;
    static String attr2;

    /**
     * constructor akan langsung dijalankan saat object dari class ini dibuat
     * constructor harus sama dengan naman class
     * constructor tidak mengembalikan nilai
     */
    public ConstructorMethod(String attr1, String attr2) {
        ConstructorMethod.attr1 = attr1;
        ConstructorMethod.attr2 = attr2;
    }
}
