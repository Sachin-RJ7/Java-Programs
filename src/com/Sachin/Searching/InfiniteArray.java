package com.Sachin.Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 22,33, 44 ,55, 66, 77, 88, 99};
        int target = 66;

        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target) {
        // find the range
        int start = 0;
        int end = 1;

        // condition for target to lie in the range
        while(target > arr[end]) {
            int newstart = end+1;
            // double the box size
            end = end + ( end - start +1 ) * 2;
            start = newstart;
        }

        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        start = 0;
        end = arr.length - 1;

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
