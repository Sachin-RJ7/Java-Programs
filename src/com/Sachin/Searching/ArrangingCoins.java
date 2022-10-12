package com.Sachin.Searching;

public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(coinsArranging(7));
    }

    public static int coinsArranging(int n) {
        long start = 1;
        long end = n;

        if (n < 0) {
            throw new IllegalArgumentException("Input number is valid: Only positive numbers are allowed");
        }

        if (n <= 3) {
            return n == 3 ? 2 : 1;
        }

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long coinsFilled = mid * (mid + 1) / 2;

            if (coinsFilled == n) {
                return (int) mid;
            }

            if (coinsFilled < n) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return (int) end;
    }
}
