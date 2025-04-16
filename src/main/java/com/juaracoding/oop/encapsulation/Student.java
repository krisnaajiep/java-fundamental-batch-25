package com.juaracoding.oop.encapsulation;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 03.17
@Last Modified 16/04/25 03.17
Version 1.0
*/

/**
 * Encapsulation
 * properti menggunakan private modifier
 * method setter dan getter menggunakan public modifier
 * method setter memiliki return type void dan menerima parameter sesuai tipe data properti yang akan di set
 * method getter memiliki return type sesuai tipe data properti yang ingin diakses dan tidak memiliki paramter
 */
public class Student {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
