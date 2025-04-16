package com.juaracoding.oop.modifier;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 05.12
@Last Modified 16/04/25 05.12
Version 1.0
*/

//import com.juaracoding.oop.modifier.in.NoModifier; // error karena no-modifier diakses di luar package
import com.juaracoding.oop.modifier.in.PrivateModifier;
import com.juaracoding.oop.modifier.in.ProtectedModifier;
import com.juaracoding.oop.modifier.in.PublicModifier;

public class ModifierMain {
    public static void main(String[] args) {
        System.out.println("Public Modifier:");
        PublicModifier publicModifier = new PublicModifier();
        System.out.println("Counter: " + publicModifier.counter);
        publicModifier.increment();
        publicModifier.increment();
        System.out.println("Counter: " + publicModifier.counter);
        publicModifier.decrement();
        System.out.println("Counter: " + publicModifier.counter);

        System.out.println("\nProtected Modifier (dapat diakses diluar package jika melalui subclas:");
        ProtectedModifier protectedModifier = new ProtectedModifier();
//        protectedModifier.setAttr("Protected"); // error karena protected
//        System.out.println(protectedModifier.attr); // error karena protected
        new SubProtectedModifier("Protected"); // output: Protected

        System.out.println("\nNo Modifier (error jika diakses diluar package)");
//        NoModifier noModifier = new NoModifier(); // error karena no-modifier

        System.out.println("\nPrivate Modifier:");
        PrivateModifier privateModifier = new PrivateModifier();
        // error karena private
//        privateModifier.set(26);
//        System.out.println(privateModifier.age);
//        System.out.println(privateModifier.yearOfBirth);
//        System.out.println(privateModifier.getYearOfBirth());

    }
}
