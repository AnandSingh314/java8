package com.practice.stream.part1;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondIntermediateOperatorOnStream {

	public static void main(String[] args) {

		String[] arr = { "Anand", "Vijay", "Singh" };
		int[] iArr = { 1, 5, 2, 8, 7, 6, 7, 5, 3, 4, 6, 7, 7, 6 };

		Stream<String> sStream = Stream.of(arr);
		IntStream iStream = IntStream.of(iArr);

		IntStream.of(iArr).sorted().forEach(i->System.out.print(i+" "));
		delimate();
		IntStream.of(iArr).distinct().forEach(i->System.out.print(i+" "));
		delimate();
		IntStream.of(iArr).limit(6).forEach(i->System.out.print(i+" "));
		delimate();
		IntStream.of(iArr).filter(e->e>3&&e<8).peek((x)->{System.out.println("filtered values: "+x);}).forEach(i->System.out.print(i+" "));
		delimate();
		IntStream.of(iArr).map(e->e*e).forEach(i->System.out.print(i+" "));
		delimate();
		sStream.sorted(Comparator.reverseOrder()).forEach(System.out::print);

		delimate();
		Stream.of(arr).forEach(s->{
			System.out.print(new StringBuilder(s).reverse());
			System.out.print(' ');
		});
		delimate();
		
		

		
	}

	static void delimate() {
		System.out.println("\n-----------------------------");
	}

}
