package com.Sachin.Searching;

public class SquareOfNumber {
    public static void main(String[] args) {
        int x = 25;
//        System.out.println(squareRoot(x));
        System.out.println(squareRoot(x));
    }


    // Binary Search : Time complexity => log(n)
    public static int squareRoot(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;     // means answer is found
            }
            // if answer is not found, check in the left part
            else if (mid > x / mid) {
                end = mid;
            }
            // Still answer is not found check in right part
            else {
                start = mid + 1;
            }
        }
        return start;
    }

    // Newtons Solution: Time complexity => log(n)...
    public static int squareRootX(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long i = x;
        while (i > x / i) {
            i = (i + x / i) / 2;
        }
        return (int)i;
    }
}
