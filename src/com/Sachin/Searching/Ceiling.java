package com.Sachin.Searching;

public class Ceiling {
    public static void main(String[] args) {
        int[] num = {22, 44, 55, 66, 77, 88, 99, 111, 222};
        int target = 77;
        int ans = ceiling(num, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {

        if(target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {

            int mid = start + ( end - start) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }

}
