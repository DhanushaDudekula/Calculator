package com.dhanu;
import java.util.*;

public class SimpleQueueExamples {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(6);
        numbers.add(4);
        numbers.add(9);
        System.out.println("Sorted numbers:");
        while (!numbers.isEmpty()) {
            System.out.print(numbers.poll() + " ");
        }

        
        PriorityQueue<Integer> funLevels = new PriorityQueue<>(Collections.reverseOrder());
        funLevels.add(3); 
        funLevels.add(9);
        funLevels.add(7);
        System.out.println("\nMost fun game score: " + funLevels.poll());

      
        PriorityQueue<Integer> list = new PriorityQueue<>(Arrays.asList(10, 4, 7, 1, 9));
        System.out.println("Smallest number: " + list.peek());

        
        PriorityQueue<String> tasks = new PriorityQueue<>();
        tasks.add("2-Code");
        tasks.add("3-Sleep");
        tasks.add("1-Eat");
        System.out.println("Urgent tasks:");
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll().split("-")[1]);
        }

        // 5. Top 2 smallest numbers
        PriorityQueue<Integer> top2 = new PriorityQueue<>(Arrays.asList(7, 3, 9, 1, 5));
        System.out.println("Top 2 smallest:");
        System.out.println(top2.poll());
        System.out.println(top2.poll());

        // 6. Cartoon-style task queue
        Queue<String> cartoon = new LinkedList<>();
        cartoon.add("Eat");
        cartoon.add("Sleep");
        cartoon.add("Code");
        System.out.println("Cartoon task queue:");
        while (!cartoon.isEmpty()) {
            System.out.println("Now: " + cartoon.poll());
        }
    }
}
