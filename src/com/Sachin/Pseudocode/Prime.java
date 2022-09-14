package com.Sachin.Pseudocode;

import java.util.Scanner;

public class Prime {

    static public int countPrimes(int n) {
        int count = 0;
        if( n == 2) {
            return count;
        }
        int temp = 2;
        while( temp < n ){

            if(isPrime(temp)) {
                count = count + 1;
            }

            temp++;
        }
        return count;
    }

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

    private static boolean primeInRange(int n) {
        // 1  and 0 is neither prime or composite
        if (n == 0 || n==1)
            return false;
        
        // 2 is a prime number
        if (n == 2)
            return true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        System.out.println(isPrime(71));
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter Lower bound of the interval");
//        int start = in.nextInt();
//        System.out.println("Enter Upper bound of the interval");
//        int last = in.nextInt();
//        System.out.printf("\nPrime number between %d and %d are: ", start, last);
//
//        for (int i = ++start; i < last ; i++) {
//            if (primeInRange(i)) {
//                System.out.print(i + " ");
//            }
//        }
//        in.close();

        System.out.println(countPrimes(5));

    }

}
