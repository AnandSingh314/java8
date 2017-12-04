package com.practice.lambdafunction;

public class ForthMultiArg {

	public static void main(String... args) {
		Calculable adder = (a, b) -> {
			System.out.printf("Adding: %d", (a + b));
		};

		adder.calculate(4, 6);
		
		System.out.println();
		Calculable subtractor = (a, b) -> {
			System.out.printf("Subtracting: %d", (a - b));
		};
		
		subtractor.calculate(20, 8);
	}
}

interface Calculable {
	void calculate(int a, int b);
}