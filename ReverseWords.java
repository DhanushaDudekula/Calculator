package com.dhanu;

public class ReverseWords {
public static void main(String[] args) {
	String str="job is nedded";
	String[]words=str.split(" ");
	for(int i=words.length-1;i>=0;i--) {
		System.out.println(words[i]+" ");
	}
}
}

