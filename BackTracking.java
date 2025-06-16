package com.dhanu;

public class BackTracking {
	public static void makeWoords(String current,String letters) {
	if(current.length()==3) {
		System.out.println(current);
		return;
	}
		for(int i=0;i<letters.length();i++) {
			
			makeWoords(current+letters.charAt(i),letters);
		}
	}
	public static void main(String[] args) {
		makeWoords("","ABC");
	}
	}


