package com.juaracoding.array.searching;

/*
IntelliJ IDEA 2024.3.5 (Ultimate Edition)
Build #IU-243.26053.27, built on March 16, 2025
@Author krisna a.k.a. Krisna Ajie
Java Developer
Created on 12/04/25 00.11
@Last Modified 12/04/25 00.11
Version 1.0
*/

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {15, 23, 36, 47, 51, 66, 78, 89};
        int target = 66;

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                System.out.println("Found: " + numbers[mid]);
                break;
            }

            if (numbers[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

    }

}
