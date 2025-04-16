package com.juaracoding.oop.interfaces;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 00.19
@Last Modified 17/04/25 00.19
Version 1.0
*/

/**
 * Class User dapat mengimplentasikan banyak interface (Storable dan Authenticable).
 * Jika ingin memperluas superclass, kata extends ke superclass lebih dulu ditulis sebelum implements
 * Semua abstract method pada abstract class dan interface harus diimplementasikan
 */
public class User extends BaseUser implements Storable, Authenticable {
    private final String name;
    private String username;
    private String password;
    private boolean registered = false;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Override register() abstract method pada interface Storable
     */
    @Override
    public void register(String username, String password) {
        if (password.length() < MIN_PASSWORD_LENGTH) {
            System.out.println("Password too short");
        } else {
            this.username = username;
            this.password = password;
            registered = true;
        }
    }

    /**
     * Override login() abstract method pada interface Authenticable
     */
    @Override
    public void login(String username, String password) {
        if (!registered) {
            System.out.println("User " + name + " not found");
        } else if(!username.equals(this.username) || !password.equals(this.password)) {
            System.out.println("Wrong username or password");
        } else if(super.isLoggedIn()) {
            System.out.println("User logged in");
        } else {
            super.login();
            System.out.println("Login successful");
        }
    }

    /**
     * Override logout() abstract method pada interface Authenticable
     */
    @Override
    public void logout() {
        if (!registered) {
            System.out.println("User " + name + " not found");
        } else if(!super.isLoggedIn()) {
            System.out.println("User " + name + " not logged in");
        } else {
            super.logout();
            System.out.println("Logout successful");
        }
    }

    /**
     * Override display() abstract method pada abstract class BaseUser
     */
    @Override
    public void display() {
        if (!registered) {
            System.out.println("User " + name + " not found");
        } else if(!super.isLoggedIn()) {
            System.out.println("User " + name + " not logged in");
        } else  {
            System.out.println("Name: " + name + "\nRole: User");
        }
    }
}
