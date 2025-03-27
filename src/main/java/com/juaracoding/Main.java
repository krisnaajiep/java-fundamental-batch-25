package com.juaracoding;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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