package com.juaracoding.oop.interfaces;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 17/04/25 00.10
@Last Modified 17/04/25 00.10
Version 1.0
*/

/**
 * Abstract class dapat mengimplementasikan interface.
 * Abstract class tidak wajib untuk mengimplementasikan seluruh abstract method pada interface
 */
public abstract class BaseUser implements Authenticable {
    private boolean loggedIn = false;

    protected void login() {
        loggedIn = true;
    }

    /**
     * Hanya meng-override logout() abstract method pada interface Authenticable
     */
    @Override
    public void logout() {
        loggedIn = false;
    }

    protected boolean isLoggedIn() {
        return loggedIn;
    }

    public abstract void display();
}
