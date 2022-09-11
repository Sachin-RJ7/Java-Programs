package com.Sachin.Pseudocode;

import java.util.Scanner;

import static com.Sachin.Pseudocode.Pseudocode.gcd;
import static com.Sachin.Pseudocode.Pseudocode.leapYear;

public class Main {
    public static void main(String[] args) {
//        int year;
//        System.out.println("Please! Enter a year");
//        Scanner sc = new Scanner(System.in);
//        year = sc.nextInt();
//        leapYear(year);

        int a, b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Ist number");
        a = scn.nextInt();
        System.out.println("Enter 2nd number");
        b = scn.nextInt();
        System.out.println("gcd = " + gcd(a, b));
    }


}
