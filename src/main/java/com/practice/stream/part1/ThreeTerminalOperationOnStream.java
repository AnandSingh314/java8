package com.practice.stream.part1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreeTerminalOperationOnStream {

	public static void main(String[] args) {
		int[] digits = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		IntStream s = IntStream.of(digits);
		long n = s.count();
		// System.out.println(s.findFirst()); // An exception is thrown

		System.out.println(IntStream.of(digits).findFirst().getAsInt());

		System.out.println("is all positive: " + IntStream.of(digits).allMatch((i) -> (i > 0)));

		System.out.println("is all negative: " + IntStream.of(digits).allMatch((i) -> (i < 0)));

		System.out.println("is any even: " + IntStream.of(digits).anyMatch((i) -> (i % 2 == 0)));

		System.out.println("is any factor of 11: " + IntStream.of(digits).anyMatch((i) -> (i % 11 == 0)));

		System.out.println("is not any factor of 11: " + IntStream.of(digits).noneMatch((i) -> (i % 11 == 0)));

		System.out.println("find any: " + IntStream.of(digits).findAny());

		System.out.println("find first: " + IntStream.of(digits).findFirst());

		System.out.println("find max: " + IntStream.of(digits).max());

		System.out.println("find min: " + IntStream.of(digits).min());

		System.out.println("reduce to sum: " + IntStream.of(digits).reduce(0, (i,j)->(i+=j)));

		System.out.println(
				"collect: " + Stream.of("Anand", "Vijay", "Singh").limit(2).collect(Collectors.toList()).toString());

		System.out.println("collect: " + Stream.of("Anand", "Vijay", "Singh").count());

		System.out.println("max: " + Stream.of("Anand", "Vijay", "Singh").max(Comparator.comparing(String::valueOf)));

		System.out.println("min: " + Stream.of("Anand", "Vijay", "Singh").min(Comparator.naturalOrder()));
		
		System.out.println("reduce it to: " + Stream.of("Anand", "Vijay", "Singh").reduce("---", (i,j)->(i+=j)));
		
		Stream.of("Anand", "Vijay", "Singh").forEach(System.out::println);

		
		
	}

}
