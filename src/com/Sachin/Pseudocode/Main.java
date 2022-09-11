package com.Sachin.Pseudocode;

import java.util.Scanner;

import static com.Sachin.Pseudocode.Pseudocode.leapYear;

public class Main {
    public static void main(String[] args) {
        int year;
        System.out.println("Please! Enter a year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        leapYear(year);

    }


}
