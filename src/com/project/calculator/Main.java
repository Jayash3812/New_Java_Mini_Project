package com.project.calculator;

import java.util.Scanner;

public class Main extends Calculator {

	public static void getOperations() {

		Calculator cal = new Calculator();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n");
			System.out.print("Enter your choice code: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				cal.getAddtions();
				break;
			case 2:
				cal.getSubtraction();
				break;
			case 3:
				cal.getMultiplication();
				break;
			case 4:
				cal.getDivision();
				break;
			case 5:
				cal.getModulus();
				break;
			case 6:
				cal.getSquare();
				break;
			case 7:
				cal.getCube();
				break;
			case 8:
				cal.getAverage();
				break;
			case 9:
				cal.getFactors();
				break;
			case 10:
				cal.getEvenOrOddNum();
				break;
			default:
				System.out.println("Invalid choice. Please select a valid operation.");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to console based application for mathematical operations");

		System.out.println("\nSelect operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.println("6. Square");
		System.out.println("7. Cube");
		System.out.println("8. Average");
		System.out.println("9. Factors");
		System.out.println("10. Check even or odd");
		System.out.println("11. Exit");
		System.out.println("\n");

		getOperations();

	}
}
