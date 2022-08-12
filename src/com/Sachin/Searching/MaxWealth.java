package com.Sachin.Searching;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 3, 4, 5},
                {6, 7, 8, 9},
                {22, 1, 3, 7}
        };
        System.out.println(accounts);
    }

    static int maxOfWeatlh(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts){
            int sum = 0;

            for(int anInt : ints) {
                sum += anInt;
            }
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
