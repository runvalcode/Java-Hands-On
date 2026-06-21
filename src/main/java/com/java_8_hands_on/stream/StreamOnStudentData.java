package com.java_8_hands_on.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOnStudentData {

	public static void main(String[] args) {

		Student studentRunval = new Student(101, "Runval B.", 28);
		Student studentJohn = new Student(102, "John Doe.", 27);
		Student studentMatt = new Student(103, "Matt Orton.", 24);

		List<Student> studentsList = Arrays.asList(studentRunval, studentMatt, studentJohn);
		Stream<Student> studentsStream = studentsList.stream();

		// print all students using forEach terminal operation
		// studentsStream.forEach(student -> System.out.println(student));

		// filter student whose age is greater than 23 get only first 2 students
		studentsStream.filter(student -> student.getAge() > 23).map(student -> {
			return "Name : " + student.getName().toUpperCase();
		}).limit(2).forEach(System.out::println);

	}

}
