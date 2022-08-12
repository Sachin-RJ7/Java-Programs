package com.Sachin.Searching;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] num = { 22,33,44,55,66,77,99,111};
        int target = 60;
        int ans = floor(num, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}
