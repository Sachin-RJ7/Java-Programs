package com.Sachin.Pseudocode;

public class Pseudocode {

    static public void leapYear (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0 )) {
            System.out.println("It's a leap year");
        }else {
            System.out.println("Not a leap year");
        }
    }


}
