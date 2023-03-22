package com.example.demo.LeetCodeEasy;

public class RomantoInteger {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }
    /*
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */

    private static int translate(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }

    public static int romanToInt(String s) {
        int result = 0;
        int curr = translate(s.charAt(0));
        System.out.println(">>>>>>>>>>" + curr);
        for (int i = 1; i < s.length(); i++) {
            System.out.println("char:  " + (s.charAt(i)));
            System.out.println("curr:  " + curr);

            int next = translate(s.charAt(i));
            if (curr < next)
                result = result - curr;
            else
                result = result + curr;
            curr = next;

            // System.out.println("char: "+s.charAt(0));
            System.out.println("next:  " + next);
            System.out.println("loop result:  " + result);
            System.out.println("\n");
        }
        result = result + curr;
        System.out.println("final:  " + result);
        return result;
    }

}
