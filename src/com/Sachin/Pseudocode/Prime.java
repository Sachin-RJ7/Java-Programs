package com.Sachin.Pseudocode;

public class Prime {
    static public boolean isPrime(int x) {
        if (x <= 1)
            return false;

        int c = 2;
        while ( c * c <= x) {
            if (x % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > x;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(71));
    }
}
