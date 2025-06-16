package com.dhanu;
public class LinearSearchSimple {
    public static void main(String[] args) {
        int[] arr = {12, 43, 90, 1, 56};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}
