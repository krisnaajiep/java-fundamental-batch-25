package com.juaracoding.method;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 04.31
@Last Modified 12/04/25 04.31
Version 1.0
*/

public class MainMethod {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {

        // Procedure method
        ProcedureMethod procedureMethod = new ProcedureMethod();
        procedureMethod.showCurrentDate();

        // Method with parameter
        MethodWithParameter methodWithParameter = new MethodWithParameter();
        methodWithParameter.printMessage("Hello World");

        // Method with return value
        MethodWithReturnValue methodWithReturnValue = new MethodWithReturnValue();
        int randomNumber = methodWithReturnValue.getRandomNumber();
        System.out.println("Random number: " + randomNumber);

        // Public method
        PublicMethod publicMethod = new PublicMethod();
        int sumArray = publicMethod.sumArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.print("Sum Array [1, 2, 3, 4, 5, 6, 7, 8, 9]: ");
        System.out.println(sumArray);

        // Private method
        PrivateMethod privateMethod = new PrivateMethod();
        int price = privateMethod.getPrice(5);
        System.out.println("Price: " + price);

        // Static method
        int factorial = StaticMethod.factorial(5);
        System.out.println("Factorial (5): " + factorial);
    }

}
