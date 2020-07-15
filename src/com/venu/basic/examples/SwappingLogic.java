package com.venu.basic.examples;

import java.util.Scanner;

public class SwappingLogic {

	public static void main(String[] args) {
		SwappingLogic logic = new SwappingLogic();
		logic.selectNumber();
	}

	public void selectNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int firstnumber = scanner.nextInt();
		System.out.println("Enter The Second Number");
		int secondNumber = scanner.nextInt();
		System.out.println("Before Swapping");
		System.out.println("First Number Is: " + firstnumber + " And Second Number Is: " + secondNumber);
		System.out.println("======================");
		System.out.println("Swapping Numbers without using temporary variable");
		swappingNumbers(firstnumber, secondNumber);
		System.out.println("Swapping Numbers using temporary variable");
		swappingNumbersUsingTemp(firstnumber, secondNumber);
		scanner.close();
	}

	// Only for Logics
	private static void swappingNumbers(int firstnumber, int secondNumber) {
		firstnumber = firstnumber + secondNumber;
		secondNumber = firstnumber - secondNumber;
		firstnumber = firstnumber - secondNumber;
		System.out.println("First Number Is: " + firstnumber + " And Second Number Is: " + secondNumber);
		System.out.println("======================");
	}

	private static void swappingNumbersUsingTemp(int firstnumber, int secondNumber) {
		int temp = firstnumber;
		firstnumber = secondNumber;
		secondNumber = temp;
		System.out.println("First Number Is: " + firstnumber + " And Second Number Is: " + secondNumber);
		System.out.println("======================");
	}
}
