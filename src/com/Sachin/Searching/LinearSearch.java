package com.Sachin.Searching;

public class LinearSearch {
    public static void main(String[] args) {
//        Scanner in = Scanner(System.in);
        String name = "com/Sachin";
        char target = 'n';
        boolean ans = linearSearch2(name, target);
        System.out.println(ans);
    }

    static boolean linearSearch2(String naam, char target) {
        if (naam.length() == 0) {
            System.out.print("Operation Failed: String Empty ");
            return false;
        }

        for (int index = 0; index < naam.length(); index++) {
            if (target == naam.charAt(index))
                return true;
        }
        return false;
    }

//    static int linearSearch(int[] arr, int target) {
//        if (arr.length == 0) {
//            System.out.print("Operation Failed: Array Empty ");
//             return -1;
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            if (target == arr[index])
//                return index;
//        }
//        return -1;
//    }

}


