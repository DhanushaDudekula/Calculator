package com.dhanu;


public class ConstantTimeExample {

	public static void printFirstElement(int[] arr) {
		if(arr.length>0) {
			System.out.println("first element is:"+arr[4]);
		}else {
			System.out.println("Array is empty");
		}

	}
	public static void main(String[] args) {
		int [] numbers= {1,23,38,40,59};
		printFirstElement(numbers);
		
	}
}

