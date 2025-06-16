
package com.dhanu;

public class BinarySearchSimple {
    public static void main(String[] args) {
        int[] arr = {2, 6, 11, 12, 16}; // Must be sorted
        int target = 16;

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index " + mid);
                return;
            }

            if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        System.out.println("Not found");
    }
}