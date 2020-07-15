package com.venu.basic.examples;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		fibonacciSeries();
	}

	private static void fibonacciSeries() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number that you want to print FibonacciSeries");
		int number = scan.nextInt();
		int firstNumber = 0, secondNumber = 1;
		int series;
		System.out.print(firstNumber + " " + secondNumber);
		for (int i = 3; i <= number; i++) {
			series = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = series;
			System.out.print(" " + series);
		}
		scan.close();

	}

}
