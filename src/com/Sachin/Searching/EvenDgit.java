package com.Sachin.Searching;

public class EvenDgit {
    public static void main(String[] args) {
        int[] num = { 12, 345, 27, 768, 6, 76969};
        System.out.println(findNumbers(num));
        System.out.println(digits(123));
    }
    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num: nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;

        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

}
