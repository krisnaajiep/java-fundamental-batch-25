package com.juaracoding.collections.arrayobjects;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 18/04/25 02.27
@Last Modified 18/04/25 02.27
Version 1.0
*/

/**
 * Selain menyimpan data primitif,
 * Array juga dapat menyimpan object
 */
public class ArrayObject {
    public static void main(String[] args) {
        // Membuat Array Task sebesar 5 capacity
        Task[] tasks = new Task[5];

        // Membuat object Task dan memasukkanna ke dalam array
        tasks[0] = new Task(1, "Buy Groceries", TaskStatus.COMPLETED);
        tasks[1] = new Task(2, "Pay Bills", TaskStatus.COMPLETED);
        tasks[2] = new Task(3, "Hit Gym", TaskStatus.IN_PROGRESS);
        tasks[3] = new Task(4, "Finish Assignment", TaskStatus.IN_PROGRESS);
        tasks[4] = new Task(5, "Cook Dishes", TaskStatus.TODO);

        // Menampilkan setiap object Task pada array melalui perulangan
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
