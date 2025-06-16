package com.dhanu;

public class Rotate {

	    public static void main(String[] args) {
	        int[][] a = {
	            {11, 2, 3},
	            {4, 50, 6},
	            {6, 8, 5}
	        };

	        int n = a.length;
	        for (int i = 0; i < n; i++) {        // Transpose
	            for (int j = i; j < n; j++) {
	                int t = a[i][j];
	                a[i][j] = a[j][i];
	                a[j][i] = t;
	            }
	        }

	        for (int i = 0; i < n; i++) {        // Reverse rows
	            for (int j = 0; j < n / 2; j++) {
	                int t = a[i][j];
	                a[i][j] = a[i][n - 1 - j];
	                a[i][n - 1 - j] = t;
	            }
	        }

	        for (int[] row : a) {               // Print matrix
	            for (int num : row)
	                System.out.print(num + " ");
	            System.out.println();
	        }
	    }
	}

