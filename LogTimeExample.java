package com.dhanu;

public class LogTimeExample {
	public static void main(String[] args) {
		int[] numbers= {3,55,7,88,9,0};
		int target=7;
		int low=0;
		int high=numbers.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(numbers[mid]==target) {
				System.out.println("found number"+ target +"at position"+mid);
				return;
			}else if(numbers[mid]<target) {
			low=mid+1;
			}else {
				high=mid-1;
				
			}
			
			}
		System.out.println("number not found");
	}
}

