package com.example;

import java.util.Scanner;

public class Example1 {
    
    public static void printWelcomeMessage() {
        System.out.println("Welcome to My Simple Java Program!");
    }
    
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        printWelcomeMessage();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        int result = addNumbers(number1, number2);
        
        System.out.println("The sum is: " + result);
        
        scanner.close();
    }
}
