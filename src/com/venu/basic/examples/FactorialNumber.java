package com.venu.basic.examples;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		printFactorialNumber();

	}

	private static void printFactorialNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number for factorial");
		int number = scan.nextInt(); 
		scan.close();
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println(result);

	}

}
