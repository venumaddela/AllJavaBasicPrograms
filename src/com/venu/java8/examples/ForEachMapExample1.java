package com.venu.java8.examples;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapExample1 {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		items.put("G", 70);
		items.put("H", 80);
		items.put("I", 90);

		// BEFORE JAVA8

		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("items key : " + entry.getKey() + " And the value is :" + entry.getValue());

		}

		// JAVA8
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		//
		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if (k.equalsIgnoreCase("h")) {
				System.out.println("Hello H");
			}
		});

	}

}
