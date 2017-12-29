package com.practice.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionalInterfaceDemo {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "john", "deep", "987-234"));
		people.add(new Person(3, "charlie", "pappu", "987-765"));
		people.add(new Person(5, "denie", "woose", "567-235"));
		people.add(new Person(2, "Bob", "tappu", "756-438"));

		BiFunction<String, String, String> getFullName = (fName, lName) -> (fName + "_" + lName);

		System.out.println("------------------------------");
		// apply identity function.
		applyFunctionOnPeople(people, getFullName);

		int[] series = { 1, 5, 3, 7, 2 };

		BiFunction<Integer, Integer, Integer> adder = (a, b) -> (a + b);

		int sum = 0;
		for (int i : series)
			sum = adder.apply(sum, i);

		System.out.println("Sum of the series: " + sum);
		

	}

	static void applyFunctionOnPeople(List<Person> people, BiFunction<String, String, String> function) {
		for (Person p : people)
			System.out.println(function.apply(p.fname, p.lname));
	}

}
