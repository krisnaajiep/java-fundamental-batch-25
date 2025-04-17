package com.juaracoding.collections;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 18.23
@Last Modified 17/04/25 18.23
Version 1.0
*/

import java.util.HashSet;

/**
 * HashSet merupakan koleksi elemen yang unique dan tidak berurutan.
 * Tidak diizinkan jika terdapat nilai duplikat pada HashSet
 */
public class HashSetMain {
    public static void main(String[] args) {
        // Create HashSet numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Add items
        numbers.add(101);
        numbers.add(102); // duplicate
        numbers.add(103);
        numbers.add(104);
        numbers.add(102); // duplicate
        numbers.add(105);

        System.out.println("\nNumbers: " + numbers);

        // HashSet size
        System.out.println("\nSize: " + numbers.size());

        // Check if an item exists
        System.out.println("\nContains (102): " + numbers.contains(102));

        System.out.println();
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Remove an item
        numbers.remove(102);
        System.out.println("\n102 removed");
        for (int i = 101; i <= 105; i++) {
            if (numbers.contains(i)) {
                System.out.println("Numbers contains " + i);
            } else {
                System.out.println("Numbers do not contain " + i);
            }
        }

        System.out.println("\nSize: " + numbers.size());

        System.out.println("\nNumbers: " + numbers);

        numbers.clear();
        System.out.println("\nAfter clear");
        System.out.println("Size: " + numbers.size());
        System.out.println("Numbers: " + numbers);
    }
}
