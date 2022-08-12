package com.Sachin.RecursionEasy;

public class Product {
    public static void main(String[] args) {
        int ans = prod(555 );
        System.out.println(ans);
    }
    static int prod(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10 ) * prod(n/10);
    }
}
