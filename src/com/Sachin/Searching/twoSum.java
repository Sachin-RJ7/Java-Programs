package com.Sachin.Searching;

public class twoSum {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,4,9,56,90};
        int target = 8;
        int ans[] = twoSum(numbers, target);
        System.out.println(ans[0] +" "+ ans[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (numbers[start] + numbers[end] == target) {
                return new int [] {start+1, end +1};
            }
            else if (numbers[start] + numbers[end] > target) {
                end--;
            }
            else
                start++;
        }
        return new int[] {-1, -1};
    }
}
