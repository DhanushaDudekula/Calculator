package com.dhanu;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {22, 74, 11, 15};
        int target = 26;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}
