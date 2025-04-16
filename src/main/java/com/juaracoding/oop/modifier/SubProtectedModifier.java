package com.juaracoding.oop.modifier;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 05.15
@Last Modified 16/04/25 05.15
Version 1.0
*/

import com.juaracoding.oop.modifier.in.ProtectedModifier;

public class SubProtectedModifier extends ProtectedModifier {
    public SubProtectedModifier(String attr) {
        // protected dapat diakses karena di dalam subclass walaupun berada di luar package
        super.setAttr(attr); // keyword super untuk memanggil method setAttr() pada Parent class
        System.out.println(super.attr); // keyword super untuk mengakses properti attr ada Parent class
    }
}
