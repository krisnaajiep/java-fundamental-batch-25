package com.juaracoding.collections;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 18.43
@Last Modified 17/04/25 18.43
Version 1.0
*/

import java.util.HashMap;

/**
 * HashMap menyimpan data dalam pasangan key-value.
 * Data / value pada HashMap di akses atau di manipulasi menggunakan Key.
 * Key dan Value dapat memiliki tipe yang sama atau berbeda.
 */
public class HashMapMain {
    public static void main(String[] args) {
        // Create HashMap fruits
        HashMap<Integer, String> fruits = new HashMap<>();

        // Add keys and values (ID, Product)
        fruits.put(1, "Apple");
        fruits.put(2, "Banana");
        fruits.put(3, "Orange");
        fruits.put(4, "Pear");
        fruits.put(5, "Water");
        fruits.put(6, "Grapes");

        System.out.println(fruits);

        // Access an item (Orange)
        System.out.println("\nID 3: " + fruits.get(3));

        // Remove an item (Water)
        fruits.remove(5);

        System.out.println("\n" + fruits);

        // HashMap Size
        System.out.println("\nSize of fruits: " + fruits.size());

        // Loop through a HashMap
        for (Integer id : fruits.keySet()) {
            System.out.println(id + ". " + fruits.get(id));
        }


    }
}
