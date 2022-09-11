package com.Sachin.Pseudocode;

public class Pseudocode {
    // to find a leap year
    static public void leapYear (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0 )) {
            System.out.println("It's a leap year");
        }else {
            System.out.println("Not a leap year");
        }
    }

//    to find gcd or hcf of two numbers
    static public int gcd(int a , int b) {
        if(b == 0)
            return a;
        return gcd( b, a % b );
    }

    static public int largestNumber(int a, int b) {
        return Math.max(a,b);
    }

}
