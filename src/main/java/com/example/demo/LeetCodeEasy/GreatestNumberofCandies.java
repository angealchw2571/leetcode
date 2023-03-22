package com.example.demo.LeetCodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestNumberofCandies {

    /*
     * There are n kids with candies. You are given an integer array candies, where
     * each candies[i] represents the number of candies the ith kid has, and an
     * integer extraCandies, denoting the number of extra candies that you have.
     * 
     * Return a boolean array result of length n, where result[i] is true if, after
     * giving the ith kid all the extraCandies, they will have the greatest number
     * of candies among all the kids, or false otherwise.
     * 
     * Note that multiple kids can have the greatest number of candies.
     * 
     * Input: candies = [2,3,5,1,3], extraCandies = 3
     * Output: [true,true,true,false,true]
     * Explanation: If you give all extraCandies to:
     * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the
     * kids.
     * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the
     * kids.
     * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the
     * kids.
     * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among
     * the kids.
     * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the
     * kids.
     */
    public static void main(String[] args) {
        int[] t = new int[] { 2, 3, 5, 1, 3 };
        kidsWithCandies(t,2);

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int[] original = new int[candies.length];
        System.arraycopy(candies, 0, original, 0, candies.length);
        System.out.println(Arrays.toString(original));
        Arrays.sort(candies);
        int max = candies[candies.length - 1];

        for (int i = 0; i < original.length; i++) {
            if (original[i] + extraCandies >= max) {
                result.add(true);
            } else
                result.add(false);
        }

        System.out.println(result);
        return result;
    }
}
