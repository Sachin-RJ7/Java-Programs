package com.Sachin.Searching;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {15, 25, 35, 45, 55},
                {17, 38, 37, 48, 59}
        };
        System.out.println(Arrays.toString(search( arr, 47)));
    }

    static int[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr.length - 1;

        while ( row < arr.length && col >= 0) {

            if ( arr[row][col] == target ) {
                return new int[] {row,col};
            }

            if(arr[row][col] < target) {
                row++ ;
            }else {
                col-- ;
            }
        }
         return new int[] { -1, -1};
    }

}