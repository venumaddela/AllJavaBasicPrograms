//Consumer is Functional Interface. having accept() abstract method. it's accepts the input parameter and return nothing ->void
//If we give student object as input, it will print data inside object
package com.venu.java8.examples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Venu Kumar");

		Function<Student, String> f1 = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks > 80) {
				grade = "A[Dictintion]";
			} else if (marks > 65) {
				grade = "B[FirstClass]";
			} else if (marks > 45) {
				grade = "C[SecondClass]";
			} else {
				grade = "Failed";
			}
			return grade;

		};
		Predicate<Student> p = student -> student.marks > 60;
		Consumer<Student> consumer = std->{
			System.out.println("Student Name:" + std.name);
			System.out.println("Student Marks:" + std.marks);
			System.out.println("Student Grade:" + f1.apply(std));
			System.out.println("============================");
			
		};
		Student[] s = { new Student("Venu", 90), new Student("Ramu", 80), new Student("Laxman", 70),
				new Student("Karthik", 48), new Student("Pankaj", 40), new Student("Dronald", 30) };
		for(Student s1:s) {
			if(p.test(s1)) {
				consumer.accept(s1);
			}
		}

	}

}
