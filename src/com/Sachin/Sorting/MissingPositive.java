package com.Sachin.Sorting;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 2, 7, 6, 9};
        int ans = misPositive( arr );
//        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static int misPositive(int[] arr) {
        int i = 0;
        while ( i < arr.length ) {
            int corIndex = arr[i] - 1 ;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[corIndex] ) {
                swap ( arr, i, corIndex);
            } else {
                i++ ;
            }
        }

        // search the missing number...
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index + 1) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
