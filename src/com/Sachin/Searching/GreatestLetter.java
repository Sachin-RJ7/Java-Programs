package com.Sachin.Searching;

public class GreatestLetter {
    public static void main(String[] args) {
        char[] num = { 'b', 'c', 'd', 'e'};
        char target = 'b';
        char ans = greatesLetter(num, target);
        System.out.println(ans);
    }

    static char greatesLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return arr[start % arr.length];
    }

}
