package com.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        // Adding key-value pairs to the HashMap
        students.put("Alice", 85);
        students.put("Bob", 92);
        students.put("Charlie", 78);
        students.put("Diana", 90);

        // Accessing the HashMap
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }

        // Checking if a key exists
        String name = "Alice";
        if (students.containsKey(name)) {
            System.out.println(name + " scored " + students.get(name));
        } else {
            System.out.println(name + " not found.");
        }
    }
}
