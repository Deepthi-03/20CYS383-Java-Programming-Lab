package com.ramaguru.amrita.cys.jpl.datastructures;

import java.util.HashMap;

/**
 * The HashMapExample class demonstrates the usage of HashMap to store and retrieve roll numbers and names.
 * It creates a HashMap to associate roll numbers with corresponding names.
 * This class provides a basic example of working with HashMap in Java.
 *
 * Usage:
 * - The program creates a HashMap called rollName to store roll numbers and names.
 * - It adds key-value pairs (roll numbers and names) to the HashMap using the put() method.
 * - It retrieves the value (name) associated with a specific key (roll number) using the get() method.
 * - It prints the retrieved name.
 *
 * Note: This example uses a HashMap of strings to represent roll numbers and names.
 *
 * Dependencies:
 * - None
 *
 * @author Deepthi J
 * @version 0.5
 */
public class HashMapExample {
    /**
     * The main method is the entry point of the program.
     * It demonstrates the usage of HashMap to store and retrieve roll numbers and names.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a HashMap object called rollName
        HashMap<String, Double> rollName = new HashMap<String, Double>();

        // Add keys and values (roll numbers and names) to the HashMap
        rollName.put("CB.EN.U4CYS21001", 81.5);
        rollName.put("CB.EN.U4CYS21011", 82.5);
        rollName.put("CB.EN.U4CYS21021", 83.5);
        rollName.put("CB.EN.U4CYS21031", 84.5);
        rollName.put("CB.EN.U4CYS21041", 85.5);
        rollName.put("CB.EN.U4CYS21051", 86.5);
        rollName.put("CB.EN.U4CYS21061", 87.5);
        rollName.put("CB.EN.U4CYS21071", 88.5);
        rollName.put("CB.EN.U4CYS21081", 89.5);

        // Retrieve and print the name associated with a specific roll number
        System.out.println(rollName.get("CB.EN.U4CYS21011"));
    }
}
