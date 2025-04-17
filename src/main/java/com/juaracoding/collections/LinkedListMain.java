package com.juaracoding.collections;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 04.18
@Last Modified 17/04/25 04.18
Version 1.0
*/

import java.util.LinkedList;

/**
 * LinkedList memiliki fungsi yang sama dengan ArrayList karena mengimplementasikan List.
 * Perbedaanya item dalam LinkedList disimpan dalam Node dan memiliki pointer ke item sesudah dan sebelumnya.
 * LinkedList lebih cocok digunakan untuk memanipulasi data,
 * sedangkan ArrayList lebih cocok digunakan untuk mengakses data.
 */
public class LinkedListMain {
    public static void main(String[] args) {
        // Create LinkedList activities
        LinkedList<String> activities = new LinkedList<>();

        // Add items
        activities.add("Eat Burger");
        activities.add("Buy Groceries");
        activities.add("Pay Bills");
        activities.add("Hit Gym");
        activities.add("Finish Assignment");
        activities.add("Cook Dishes");
        activities.add("Drink Coffee");

        System.out.println("Activities: " + activities);

        // LinkedList size
        System.out.println("Size: " + activities.size());

        // Remove an item from the beginning of the list
        activities.removeFirst();
        System.out.println("\nRemoved First: " + activities);
        System.out.println("Size: " + activities.size());

        // Remove an item from the end of the list
        activities.removeLast();
        System.out.println("\nRemoved Last: " + activities);
        System.out.println("Size: " + activities.size());

        // Add an item to the beginning of the list
        activities.addFirst("Brushing Teeth");

        // Get the item at the beginning of the list
        System.out.println("\nAdded First: " + activities.getFirst());
        System.out.println("Size: " + activities.size());

        // Add an item to the end of the list
        activities.addLast("Drink Milk");

        // Get the item at the end of the list
        System.out.println("\nAdded Last: " + activities.getLast());
        System.out.println("Size: " + activities.size());

        System.out.println("\nActivities: " + activities);
    }
}
