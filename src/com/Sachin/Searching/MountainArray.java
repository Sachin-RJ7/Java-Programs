package com.Sachin.Searching;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 22, 33, 44, 55, 66, 77, 88, 44, 33, 22, 11};
        int ans = peakMountain(arr);
        System.out.println(ans);
    }

    static int peakMountain(int[] arr ) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + ( end - start ) / 2;

            if ( arr[mid] > arr[mid + 1]) {
                // we are in decreasing part of array
                end = mid;
            } else {
                // we are in acending part of array
                start = mid + 1;
            }
        }
        // at last, start == end..
        return start; // or return end can be written
    }

}
