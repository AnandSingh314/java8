package com.practice.stream.part1;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FirstCreateStream {

	public static void main(String[] args) {

		String[] arr = { "Anand", "Vijay", "Singh" };
		int[] iArr = { 1, 5, 2, 87, 675, 3, 4, 67, 76 };

		Stream<String> sStream = Stream.of(arr);
		IntStream iStream = IntStream.of(iArr);

		LongStream lStream = LongStream.of(1L, 2L, 3L, 4L, 5L);
		DoubleStream dStream = DoubleStream.of(2.3f, 6.4f, 6.3f, 6.5f, 9.7f, 6.4f, 8.5f, 6.2f);

		Consumer p = System.out::println;
		IntConsumer ip = System.out::println;

		iStream.forEach(ip);
		delimate();
		sStream.forEach(p);
		delimate();
		lStream.forEach(System.out::println);
		delimate();
		dStream.forEach(System.out::println);

		
	}

	static void delimate() {
		System.out.println("-----------------------------");
	}

}
