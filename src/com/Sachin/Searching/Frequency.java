package com.Sachin.Searching;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        System.out.print("Enter any digit : ");
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        System.out.println("Enter a number from the digit: ");
        int n = input.nextInt();
        int count = 0 ;

        do {
            int temp = digit % 10;
            digit = digit/10;
            if(temp == n) {
                count += 1;
            }
        }while(digit!=0);
        System.out.println(count);
    }
}
