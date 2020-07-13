package com.venu.java8.examples;

import java.util.function.Function;
import java.util.function.Predicate;

//Function is FI and it's takes some inputs and performs some operations and returns the output
//apply(T t,R r)

public class FunctionExample {

	public static void main(String[] args) {
		// Find length of the string
		Function<String, Integer> f = s -> s.trim().length();
		System.out.println(f.apply("Venu Kumar Maddela"));

		// i/p - Student o.p -> grade
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
		Student[] s = { new Student("Venu", 90), new Student("Ramu", 80), new Student("Laxman", 70),
				new Student("Karthik", 48), new Student("Pankaj", 40), new Student("Dronald", 30) };
		for (Student student : s) {
			System.out.println("Student Name:" + student.name);
			System.out.println("Student Marks:" + student.marks);
			System.out.println("Student Grade:" + f1.apply(student));
			System.out.println("============================");
		}
		
		// Student details who got more than 60 marks
		System.out.println("Student details who got more than 60 marks");
		Predicate<Student> p = student->student.marks>60;
		for(Student student : s) {
			if(p.test(student)) {
				System.out.println("Student Name:" + student.name);
				System.out.println("Student Marks:" + student.marks);
				System.out.println("Student Grade:" + f1.apply(student));
				System.out.println("============================");
			}
		}
		
		//Function Chaining
		System.out.println("Function Chaining Example");
		Function<Integer, Integer> f2=i->i*2;
		Function<Integer, Integer> f3=i->i*i*i;
		System.out.println(f2.andThen(f3).apply(4)); //First f2 excutes and then f3 -> f2 ->4*2=8 andThen f3->8*8*8 = 512
		System.out.println(f2.compose(f3).apply(4)); //first f3->4*4*4=64 then f2->64*2=128
		
	}

}
