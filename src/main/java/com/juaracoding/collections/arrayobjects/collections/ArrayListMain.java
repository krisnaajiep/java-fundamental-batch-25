package com.juaracoding.collections.arrayobjects.collections;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 02.01
@Last Modified 17/04/25 02.01
Version 1.0
*/

import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList adalah array yang ukurannya dapat diubah / fleksibel.
 * Berbeda dengan array built-in yang ukurannya tidak bisa diubah / tetap.
 */
public class ArrayListMain {
    public static void main(String[] args) {
        // Create ArrayList countries
        ArrayList<String> countries = new ArrayList<>();

        // Add items
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("United Kingdom");
        countries.add("France");
        countries.add("Germany");
        countries.add("United States");

        // Remove an item by index
        countries.remove(1);

        // Change an item by index
        countries.set(4, "Indonesia");

        Collections.sort(countries); // Sort countries

        // Loop through ArrayList
        for (int i = 0; i < countries.size(); i++) {
            System.out.println(i + 1 + ". " + countries.get(i));
        }

        // Access an item by index
        System.out.println("\n4th country: " + countries.get(3));

        // ArrayList size
        System.out.println("\nSize: " + countries.size());

        // Remove all items in ArrayList
        countries.clear();

        System.out.println("Size after clear: " + countries.size());
    }
}
