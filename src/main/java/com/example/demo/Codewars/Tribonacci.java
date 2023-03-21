package com.example.demo.Codewars;

import java.util.Arrays;

public class Tribonacci {

    public static void main (String[] args){
        double[] t = new double[] { 5, 9, 15 };
        tribonacci(t, 2);
    }

    public static double[] tribonacci(double[] s, int n) {
        if (n == 0){
            return new double[]{};
        }
        double[] answer = new double[n];
        for (int j = 0;j < s.length && j < n; j++) {
            answer[j] = s[j];
        }
        for (int i = 3; i < n; i++) {
            // System.out.println(s[i-1] +s[i-2] +s[i-3]);
            answer[i] = answer[i-1] +answer[i-2] +answer[i-3];
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
