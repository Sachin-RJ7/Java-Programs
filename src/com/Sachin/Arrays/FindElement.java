package com.Sachin.Arrays;

import java.util.ArrayList;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = { 2, 44, 5, 6, 7 , 7, 8};
//        System.out.println( find(arr, 0, 6));
//        System.out.println( findIndex(arr, 0, 6));
//        System.out.println( findIndexLast(arr, arr.length-1, 7));
//        findAllIndex(arr, 0, 77);
//        System.out.println(list);
//
//        ArrayList<Integer> ans = findAllIndex(arr, 0, 7, new ArrayList<>());
//        System.out.println(ans);

        System.out.println(findAllIndex2(arr, 0, 7));
    }

     static boolean find(int[] arr, int index, int target) {
        // base condition
         if (index == arr.length) {
             return false;
         }

         return arr[index] == target || find(arr, index + 1, target);
     }


    // finding the index from starting position
    static int findIndex(int[] arr, int index, int target) {
        // base condition
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndex(arr, index + 1, target);
        }
    }


    // find the index starting from end position
    static int findIndexLast(int[] arr, int index, int target) {
        // base condition
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }
        else {
            return findIndexLast(arr, index - 1, target);
        }
    }


    // finding all the indexes
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int index, int target) {
        // base condition
        if (index == arr.length) {
            return  ;
        }

        if (arr[index] == target) {
             list.add(index);
        }
        findAllIndex(arr, index + 1, target);
    }


    // returning all indexes through ArrayList
    static ArrayList findAllIndex(int[] arr, int index, int target, ArrayList<Integer> list ) {
        // base condition
        if (index == arr.length) {
            return list  ;
        }

        if (arr[index] == target) {
            list.add(index);
        }
         return findAllIndex(arr, index + 1, target, list);
    }


    static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target ) {
        ArrayList<Integer> list2 = new ArrayList<>();
        // base condition
        if (index == arr.length) {
            return list2  ;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list2.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, index + 1, target);

        list2.addAll(ansFromBelowCalls);

        return list2;
    }

}
