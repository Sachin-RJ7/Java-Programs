package com.Sachin.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {22, 44, 55, 66, 77, 88, 99, 111, 222, 333};
        int target = 333;
        int ans = binarysearch(num, target);
        System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
