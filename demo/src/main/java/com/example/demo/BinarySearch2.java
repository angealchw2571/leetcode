package com.example.demo;

import java.util.Arrays;

public class BinarySearch2 {
    // Main driver method
    public static void main(String[] args) {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int intKey = 22;

        for (int i : intArr) {
            System.out.println(i);
        }
        for (int j = 0; j < intArr.length; j++) {
            System.out.println(intArr[j]);
        } // Print the key and corresponding index
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey));
    }
}