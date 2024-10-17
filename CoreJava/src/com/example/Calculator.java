package com.example;

import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        
        System.out.println("Choose an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        switch (operation) {
            case '+': result = number1 + number2; break;
            case '-': result = number1 - number2; break;
            case '*': result = number1 * number2; break;
            case '/': result = number1 / number2; break;
            default: System.out.println("Invalid operation");
        }
        
        System.out.println("The result is: " + result);
        scanner.close();
    }
}
