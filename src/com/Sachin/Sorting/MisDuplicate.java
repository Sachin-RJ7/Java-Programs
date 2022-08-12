package com.Sachin.Sorting;

import java.util.Arrays;

public class MisDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        int[] ans = missingNumber( arr );
        System.out.println(Arrays.toString(ans));
//        System.out.println(ans);
    }

    static int[] missingNumber(int[] arr) {
        int i = 0;
        while ( i < arr.length ) {
            int corIndex = arr[i] - 1;
            if ( arr[i] != arr[corIndex] ) {
                swap ( arr, i, corIndex);
            } else {
                i++ ;
            }
        }

        // search the missing number...
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
