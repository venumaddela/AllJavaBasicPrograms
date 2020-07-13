package com.venu.java8.examples;

import java.util.ArrayList;
import java.util.List;

public class ForEachListExample1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// Before JAVA8
		for (Integer items : list) {
			System.out.println(items);
		}

		// Java8
		list.forEach(k -> System.out.println("Values in java8 : " + k));

		// Condition check in java8
		list.forEach(k -> {
			if (k.equals(100)) {
				System.out.println("Hello");
			} else {
				System.out.println("Not available");
			}
		});

		// Method Reference
		System.out.println("Method Reference");

		list.forEach(System.out::println);

		System.out.println("Streams");

		list.stream()
			.filter(i -> i.equals(10))
			.forEach(System.out::println);

	}

}
