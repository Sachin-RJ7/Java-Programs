package com.Sachin.Bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(1));
    }
    static boolean powerOfTwo(int n) {
        if ( n == 0 || n == 1) {
            return false;
        }
        else {
            return (n & ( n - 1)) == 0;
        }
    }
}
