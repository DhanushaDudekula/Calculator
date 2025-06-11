package com.dhanu;
import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] names = {"dhanu", "jaa", "laari", "harshi"};
        Arrays.sort(names);  

        for (String name : names)
            System.out.println(name);
    }
}