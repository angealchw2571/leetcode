package com.example.demo.LeetCodeEasy;

import java.util.HashMap;

/*

Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

 */
public class NumberofGoodPairs {
    public static void main(String[] args){
        int []input  = {1,2,3,1,1,3,1};
        numIdenticalPairs(input);
    }
    private static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> numberHash = new HashMap<Integer, Integer>();
        for (int num : nums){
            if (numberHash.containsKey(num)){
                numberHash.put(num, numberHash.get(num)+1);
            } else 
                numberHash.put(num, 1);
            ans += numberHash.get(num) - 1 ;
        }
        System.out.println(numberHash);
        System.out.println(ans);
        return ans;
    }
}
