package com.Sachin.Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        pattern3(n);
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
