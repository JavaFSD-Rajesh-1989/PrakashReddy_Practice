package com.example;

import java.util.Scanner;

public class LargestNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        
        int largest = number1;
        
        if (number2 > largest) {
            largest = number2;
        }
        
        if (number3 > largest) {
            largest = number3;
        }
        
        System.out.println("The largest number is: " + largest);
        scanner.close();
    }
}
