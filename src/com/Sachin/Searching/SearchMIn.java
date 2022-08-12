package com.Sachin.Searching;

import java.util.Arrays;

public class SearchMIn {
    public static void main(String[] args) {

        int [][] num = {
                {2,33,443,64,22,77},
                {77,88,99,121,345},
                {66,34,45,76,99}
        };

        int target = 88;
        int[] ans = searchMin(num,target);
        System.out.println(Arrays.toString(ans));


    }

    static int[] searchMin(int[][] arr, int target) {
        if(arr.length == 0) {
            return new int[]{ -1 };
        }

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{ row, col };
                }
            }
        }
        return new int[]{ -1, -1};
    }
}
