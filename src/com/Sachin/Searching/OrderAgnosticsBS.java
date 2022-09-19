package com.Sachin.Searching;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
//        int[] arr =  { -18, -14, -10, -5, 0, 1, 7, 21, 77};
        int[] arr = {99, 88, 77, 66, 55, 33, 22, 11};
        int target = 77;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if ( target == arr[mid])
                return mid;

            if (isAsc) {
                if ( target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if ( target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
