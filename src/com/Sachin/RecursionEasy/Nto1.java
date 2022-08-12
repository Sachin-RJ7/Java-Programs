package com.Sachin.RecursionEasy;

public class Nto1 {
    public static void main(String[] args) {
       fun1(5 );
    }

    static void fun( int n ) {
        if (n > 0) {
            System.out.println(n);
            fun(n -1 );
        }
    }

//  concept
    static void fun1( int n ) {
        if (n > 0) {
            System.out.println(n);
//            fun1(n--);
            fun1(--n);
        }
    }
}
