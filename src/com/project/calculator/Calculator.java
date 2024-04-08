package com.project.calculator;

import java.util.Scanner;

import com.project.methods.Methods;

public class Calculator implements Methods{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void getAddtions() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Addition is: " + (num1 + num2));
		
	}

	@Override
	public void getAverage() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int count = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += scanner.nextDouble();
        }
        System.out.println("Average is: " + (sum / count));
	}

	@Override
	public void getCube() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = scanner.nextDouble();
        System.out.println("Cube is: " + (num * num * num));
	}

	@Override
	public void getDivision() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Division is: " + (dividend / divisor));
        }
    }
	

	@Override
	public void getEvenOrOddNum() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
	}

	@Override
	public void getFactors() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
	}

	@Override
	public void getModulus() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Modulus is: " + (num1 % num2));
	}

	@Override
	public void getMultiplication() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Multiplication is: " + (num1 * num2));
	}

	@Override
	public void getSquare() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = scanner.nextDouble();
        System.out.println("Square is: " + (num * num));
	}

	@Override
	public void getSubtraction() {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
	        System.out.println("Subtraction is: " + (num1 - num2));
	}

}
