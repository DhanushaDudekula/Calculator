package com.dhanu;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first numer");
        double a = input.nextDouble();
        System.out.println("enter second numer");
        double b = input.nextDouble();
        System.out.println("enter operator");
        char op = input.next().charAt(0);
        double res = 0;

        if (op == '+') res = a + b;
        else if (op == '-') res = a - b;
        else if (op == '*') res = a * b;
        else if (op == '/') res = a / b;

        System.out.println("Result: " + res);
        input.close();
    }
    
}