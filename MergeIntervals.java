package com.dhanu;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

		public static int[][] merge(int[][] intervals) {
	        if (intervals.length <= 1) return intervals;

	   
	        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

	        List<int[]> merged = new ArrayList<>();

	        int[] current = intervals[0];
	        merged.add(current);

	        for (int[] interval : intervals) {
	  
	            if (interval[0] <= current[1]) {
	               
	                current[1] = Math.max(current[1], interval[1]);
	            } else {
	                
	                current = interval;
	                merged.add(current);
	            }
	        }

	        return merged.toArray(new int[merged.size()][]);
	    }

	    public static void main(String[] args) {
	        int[][] intervals = { {1,6}, {9,0}, {8,11}, {16,19} };
	        int[][] result = merge(intervals);

	        System.out.print("Merged intervals: ");
	        for (int[] interval : result) {
	            System.out.print(Arrays.toString(interval) + " ");
	        }

	}

}


