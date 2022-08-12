package com.Sachin.Sorting;


import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2 };
        cyclicSort( arr );
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int corIndex = arr[i];
            if (arr[i] != arr[corIndex]) {
                swap(arr, i, corIndex);
            } else {
                i++;
            }
        }
    }

    // swapping function...
    static void swap ( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
