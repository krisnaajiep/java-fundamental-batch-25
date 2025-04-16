package com.juaracoding.oop.encapsulation;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 03.14
@Last Modified 16/04/25 03.14
Version 1.0
*/

public class EncapsulationMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("1234");
        student.setName("Krisna");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
    }
}
