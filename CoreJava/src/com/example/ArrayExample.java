package com.example;

import java.util.Scanner;

public class ArrayExample {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("You entered: ");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        scanner.close();
    }
}
