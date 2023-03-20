package com.example.demo.LeetCodeEasy;

public class RichestCustomerWealth {

    /*
     * You are given an m x n integer grid accounts where accounts[i][j] is the
     * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
     * bank. Return the wealth that the richest customer has.
     * 
     * A customer's wealth is the amount of money they have in all their bank
     * accounts. The richest customer is the customer that has the maximum wealth.
     * 
     * Input: accounts = [[1,5],[7,3],[3,5]]
     * Output: 10
     * Explanation:
     * 1st customer has wealth = 6
     * 2nd customer has wealth = 10
     * 3rd customer has wealth = 8
     * The 2nd customer is the richest with a wealth of 10.
     */
    public static void main(String[] args) {
        System.out.println("hello");
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        maximumWealth(accounts);
    }

    public static int maximumWealth(int[][] accounts) {
        int currentMax = 0;
        for (int[] account : accounts){
            int temp = 0;
            for(int val : account){
                temp += val;
            }
            System.out.println(temp);
            if (temp >  currentMax)
                currentMax = temp;
        }    
        return currentMax; 
    }

}
