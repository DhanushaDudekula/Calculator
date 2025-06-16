package com.dhanu;

public class MaxSum {
	
	    public static void main(String[] args) {
	        int[] nums = {-22, -1, -3, 40, -1, 2, 1, -5, 4};

	        int max = nums[0], sum = nums[0];
	        for (int i = 1; i < nums.length; i++) {
	            sum = sum < 0 ? nums[i] : sum + nums[i];
	            max = Math.max(max, sum);
	        }

	        System.out.println("Max sum: " + max);
	    }
	}

