package com.dhanu;
import java.util.*;

public class SocialCircle {

    static void dfsRec(String p, Map<String, List<String>> g, Set<String> v, List<String> res) {
        v.add(p); res.add(p);
        for (String f : g.getOrDefault(p, List.of()))
            if (!v.contains(f)) dfsRec(f, g, v, res);
    }

    static List<String> getCircleRec(String p, Map<String, List<String>> g) {
        Set<String> v = new HashSet<>(); List<String> res = new ArrayList<>();
        dfsRec(p, g, v, res); return res;
    }

    static List<String> getCircleIter(String p, Map<String, List<String>> g) {
        Set<String> v = new HashSet<>(); List<String> res = new ArrayList<>();
        Stack<String> s = new Stack<>(); s.push(p);
        while (!s.isEmpty()) {
            String cur = s.pop();
            if (v.add(cur)) {
                res.add(cur);
                for (String f : g.getOrDefault(cur, List.of())) s.push(f);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Map<String, List<String>> g = new HashMap<>();
        g.put("A", List.of("B", "C")); g.put("B", List.of("A"));
        g.put("C", List.of("A")); g.put("D", List.of("E"));
        g.put("E", List.of("D")); g.put("F", List.of());

        System.out.println("Rec A: " + getCircleRec("A", g));
        System.out.println("Iter A: " + getCircleIter("A", g));
        System.out.println("Rec D: " + getCircleRec("D", g));
        System.out.println("Iter D: " + getCircleIter("D", g));
        System.out.println("Rec F: " + getCircleRec("F", g));
        System.out.println("Iter F: " + getCircleIter("F", g));
    }
}