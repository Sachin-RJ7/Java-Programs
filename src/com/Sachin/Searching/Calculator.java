package com.Sachin.Searching;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;

        while (true) {
            System.out.print("Enter the operator: ");
            char ch = input.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '%' || ch == '/' || ch == '*') {
                System.out.print("Enter two number: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (ch == '+') {
                    result = num1 + num2;
                }
                if (ch == '-') {
                    result = num1 - num2;
                }
                if (ch == '*') {
                    result = num1 * num2;
                }
                if (ch == '%') {
                    result = num1 % num2;
                }
                if (ch == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                } else if (ch == 'x' || ch == 'X') {
                    break;
                } else {
                    System.out.println("Invalid Operation:");
                }
                System.out.println("The result of operation : " + result);
            }
        }
    }
}