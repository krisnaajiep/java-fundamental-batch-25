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

public class Variable {
    public static void main(String[] args) {
        String firstName = "Krisna";
        String lastName = "Ajie";
        byte age = 26;
        char gender = 77;
        boolean isSingle = true;
        float height = 178.5f;

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Gender: " + gender);
        System.out.println("Status: " + (!isSingle ? "Married" : "Single"));
        System.out.println("Height: " + height + " cm");

        // Type Casting
        // Widening or Conversion
       /* short s = 123;
        long l = s;
        System.out.println(l);*/

        //Narrowing
        /*double d = 180.34503125;
        float f = (float) d;
        System.out.println(f);*/

        // Variable passing by value vs Variable passing by reference
        // Variable passing by value
        /*int umur = 25;
        int duplikatUmur = umur;
        duplikatUmur = 26;

        System.out.println(umur);
        System.out.println(duplikatUmur);*/

        // Variable passing by reference
       /* Rectangle kotak = new Rectangle(20, 40);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(30, 50);

        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());*/
    }
}