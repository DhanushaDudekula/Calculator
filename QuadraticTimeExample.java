package com.dhanu;

public class QuadraticTimeExample {
	public static void main(String[] args) {
		int[] numbers= {3,7,78,54,67};
		boolean hasDuplicate=false;
		for(int i=0;i<numbers.length;i++) {
			for(int j =i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					hasDuplicate=true;
					System.out.println("Duplicate Found:"+numbers[i]);
					
				}
				
			}
		}
		if(!hasDuplicate) {
			System.out.println("Not found");
		}
		
		
	}

}
