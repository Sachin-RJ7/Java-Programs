package com.Sachin.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = { 2, 44, 5, 6, 7, 8};
        System.out.println( sorted(arr, 0));
    }

    static boolean sorted(int[] arr,int index) {
        // Remember: base condition
        if (index == arr.length-1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr,index + 1);
    }
}
