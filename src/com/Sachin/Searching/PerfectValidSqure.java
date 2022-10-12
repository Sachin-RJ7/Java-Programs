package com.Sachin.Searching;

public class PerfectValidSqure {
    public static void main(String[] args) {
        System.out.println(perfectSquare(2147483647));
    }

    public static boolean perfectSquare(int num) {
        int start = 1;
        int end = num;

        while (start <= end){
            long mid = start + (end - start) / 4;

            if (mid * mid == num) {
                return true;
            }

            if (mid * mid > num) {
                end = (int)mid - 1;
            }
            else {
                start = (int)mid + 1;
            }
        }
        return false;
    }

}
