package com.example.demo.Codewars;

public class DigitalRoot {
    /*
     * Digital root is the recursive sum of all the digits in a number.
     * 
     * Given n, take the sum of the digits of n. If that value has more than one
     * digit, continue reducing in this way until a single-digit number is produced.
     * The input will be a non-negative integer.
     * 
     * Examples
     * 16 --> 1 + 6 = 7
     * 942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
     * 132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
     * 493193 --> 4 + 9 + 3 + 1 + 9 + 3 = 29 --> 2 + 9 = 11 --> 1 + 1 = 2
     */
    public static void main(String[] args) {
        digital_root(16);
    }

    public static int digital_root(int n) {
        int temp = 0;
        String number = String.valueOf(n);
        char[] digits = number.toCharArray();
        // System.out.println(digits[0]);
        for (char digit : digits) {
            temp += Character.getNumericValue(digit);
        }
        System.out.println(temp);
        if (temp < 10) {
            return temp;
        } else
            return digital_root(temp);
    }

}
