package com.juaracoding.oop;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 00.23
@Last Modified 16/04/25 00.23
Version 1.0
*/

public class CreateObject {
    public static void main(String[] args) {
        // Deklarasi variable CreateClass
        CreateClass createClass;
        // Membuat object CreateClass
        createClass = new CreateClass();
        System.out.println("createClass Object: " + createClass);

        System.out.println();

        // Membuat object Fruit
        Fruit fruit = new Fruit();
        // Set grams attribute to 10
        fruit.grams = 10;
        System.out.println("Grams: " + fruit.grams); // mengakses properti grams
        // set calsPerGram attribute to 5
        fruit.calsPerGram = 5;
        System.out.println("CalsPerGram: " + fruit.calsPerGram); // mengakses properti calsPerGram
        // get Total calories menggunakan method totalCalories()
        System.out.print("Total calories of fruit (grams * calsPerGram): ");
        System.out.println(fruit.totalCalories()); // mengakses method totalCalories()
    }
}
