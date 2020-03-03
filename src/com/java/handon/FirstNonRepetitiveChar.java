package com.java.handon;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepetitiveChar {

    public static void main(String[] args) {
        String str = "aaabbccdeeffg";
        findNonRepFirst(str);
    }

    private static void findNonRepFirst(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put(str.charAt(0), 1);
        for (int i = 1; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }

        Optional<Character> first = map.entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first.get());
    }
}
