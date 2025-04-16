package com.juaracoding.oop.interfaces;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 00.32
@Last Modified 17/04/25 00.32
Version 1.0
*/

/**
 * Class Admin mengimplentasikan 1 interface (Authenticable).
 * Jika ingin memperluas superclass, kata extends ke superclass lebih dulu ditulis sebelum implements
 * Semua abstract method pada abstract class dan interface harus diimplementasikan
 */
public class Admin extends BaseUser implements Authenticable {
    /**
     * Override login() abstract method pada interface Authenticable
     */
    @Override
    public void login(String username, String password) {
        if (username.equals("admin") && password.equals("admin123")) {
            super.login();
            System.out.println("Login successful");
        } else {
            System.out.println("Wrong username or password");
        }
    }

    /**
     * Override logout() abstract method pada interface Authenticable
     */
    @Override
    public void logout() {
        if (super.isLoggedIn()) {
            super.logout();
            System.out.println("Logout successful");
        } else {
            System.out.println("Admin not logged in");
        }
    }

    /**
     * Override display() abstract method pada abstract class BaseUser
     */
    @Override
    public void display() {
        if (super.isLoggedIn()) {
            System.out.println("Name: Admin\nRole: Admin");
        } else {
            System.out.println("Admin not logged in");
        }
    }
}
