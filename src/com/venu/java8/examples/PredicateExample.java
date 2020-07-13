//Predicate is FI. It's checks the condition and returns the boolean.
//method: test(T t)
package com.venu.java8.examples;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		int[] nums = { 0, 2, 3, 4, 5, 6, 7, 8, 10, 12, 15 };
		Predicate<Integer> p1 = i -> i % 2 == 0; // p1-->0,2,4,6,8,10,12
		// System.out.println(p.test(10));
		System.out.println("Even Numbers are:");
		for (Integer result : nums) {
			if (p1.test(result)) {
				System.out.println(result);
			}
		}
		System.out.println();
		// Divided by 5 and even numbers
		System.out.println("Numbers which is devided by 5 and even");
		Predicate<Integer> p2 = i -> i % 5 == 0; // p2-->0,5,10,15
		for (int result : nums) {
			if (p1.and(p2).test(result)) {
				System.out.println(result); // 0,10
			}

		}
		System.out.println();
		System.out.println("Numbers which is devided by 5 or even");
		for (int result : nums) {
			if (p1.or(p2).test(result)) {
				System.out.println(result); // 0,2,4,6,8,10,12,15
			}

		}
		System.out.println();
		System.out.println("Numbers which are not even");
		
		for (int result : nums) {
			if (p1.negate().test(result)) {
				System.out.println(result); // 3,5,7,15
			}

		} 
		

	}

}
