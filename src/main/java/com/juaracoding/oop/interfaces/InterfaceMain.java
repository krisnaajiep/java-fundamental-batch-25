package com.juaracoding.oop.interfaces;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 16/04/25 23.44
@Last Modified 16/04/25 23.44
Version 1.0
*/

public class InterfaceMain {
    public static void main(String[] args) {
        System.out.println("Minimum password length: " + Storable.MIN_PASSWORD_LENGTH);

        System.out.println();

        User user = new User("Krisna");
        user.register("krisna", "krisna123");
        user.login("krisna", "krisna123");
        user.display();
        user.logout();

        System.out.println();

        Admin admin = new Admin();
        admin.login("admin", "admin123");
        admin.display();
        admin.logout();
    }
}
