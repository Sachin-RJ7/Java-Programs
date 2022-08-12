package com.Sachin.Sorting;

import java.util.Arrays;

public class FindMIssingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 3 };
        int ans = missingNumber( arr );
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while ( i < arr.length ) {
            int corIndex = arr[i]  ;
            if (arr[i] < arr.length && arr[i] != arr[corIndex] ) {
                swap ( arr, i, corIndex);
            } else {
                i++ ;
            }
        }

        // search the missing number...
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
