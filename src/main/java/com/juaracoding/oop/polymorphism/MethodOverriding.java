package com.juaracoding.oop.polymorphism;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 03.51
@Last Modified 16/04/25 03.51
Version 1.0
*/

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.define(); // output: This is Animal
        animal.sound(); // output: Animal sound

        System.out.println();

        Animal cat = new Cat();
        cat.define(); // output: This is animal
        cat.sound(); // output: Cat sound

        System.out.println();

        Animal dog = new Dog();
        dog.define(); // output: This is Animal
        dog.sound(); // output: Dog sound
    }
}

/**
 * Method Overriding
 * mendefinisikan ulang method yang sudah ada di superclass oleh setiap subclass.
 * Terjadi pada waktu runtime.
 * Subclass hanya dapat meng-override method superclass yang sama satu kali.
 * Method yang di-override pada subclass tidak boleh mempunyai modifier yang lebih ketat.
 * Overriding tidak berlaku untuk static, private, atau final method milik superclass
 */
class Animal {
    // bisa di-override
    public void sound() {
        System.out.println("Animal sound");
    }

    // tidak bisa di-override
    public static void define() {
        System.out.println("This is Animal");
    }
}

class Cat extends Animal {
    // melakukan overriding
    public void sound() {
        System.out.println("Cat sound");
    }

    // tidak melakukan overriding
    public static void define() {
        System.out.println("This is Cat");
    }
}

class Dog extends Animal {
    // melakukan overriding
    public void sound() {
        System.out.println("Dog sound");
    }

    // tidak melakukan overriding
    public static void define() {
        System.out.println("This is Dog");
    }
}
