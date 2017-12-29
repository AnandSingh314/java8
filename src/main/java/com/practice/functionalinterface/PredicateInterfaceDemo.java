package com.practice.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		int[] series = { 6, -4, 7, -2, -9, -7, 2, 9 };

		Predicate<Integer> isPositive = i -> i > 0;
		Predicate<Integer> isNegative = i -> i < 0;

		System.out.println("---------------isPositive-------------------");
		applyOnSeries(series, isPositive);

		System.out.println("--------------negating isPositive-----------");
		applyOnSeries(series, isPositive.negate());

		System.out.println("-------------------isEven-------------------");
		applyOnSeries(series, s-> s%2==0);

		System.out.println("-----------  isEven And Positive -----------");
		applyOnSeries(series, isPositive.and(s-> s%2==0));

		System.out.println("----------- ! (isEven And Positive) -----------");
		applyOnSeries(series, isPositive.and(s-> s%2==0).negate());

		System.out.println("----------- Positive or even -----------");
		applyOnSeries(series, isPositive.or(s-> s%2==0));

		
	}

	static void applyOnSeries(int[] series, Predicate<Integer> predicate) {
		for (int i : series)
			if (predicate.test(i))
				System.out.println(i);
		// System.out.println(""+i+": is trues for given predicate");
		// else
		// System.out.println(""+i+": is false for given predicate");
	}

}
