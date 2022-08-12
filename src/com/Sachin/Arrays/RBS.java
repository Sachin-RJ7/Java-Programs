package com.Sachin.Arrays;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {77, 2, 11, 5, 88, 11, 99};
        System.out.println(search(arr, 88, 0, arr.length-1));
    }

    // Not giving answer when searching for greater than number ????????????????????????????????????????????????????????

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }


}


