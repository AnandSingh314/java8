package com.practice.methodreference;

import java.util.function.BiFunction;

import javax.swing.FocusManager;

public class FirstStaticMethod {

	// method shouldn't have input argument
	public static void saySomething() {
		System.out.println("method is saying something....");
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		// direct reference
		Sayable stt = FirstStaticMethod::saySomething;
		stt.say();

		// passing in method param
		Thread t = new Thread(FirstStaticMethod::saySomething);
		t.start();

		/*
		 * use of java.util.function package Interface abstract method signature
		 * should match to the referenced method.
		 * 
		 * BiFunction<arg1, arg2, returnType>
		 */
		BiFunction<Integer, Integer, Integer> adder = FirstStaticMethod::add;
		BiFunction<Integer, Float, Float> adder2 = FirstStaticMethod::add;
		BiFunction<Float, Float, Float> adder3 = FirstStaticMethod::add;
		

		System.out.println("Adder : " + adder.apply(10, 299));
		System.out.println("Adder2 : " + adder2.apply(10, 299.23f));
		System.out.println("Adder3 : " + adder3.apply(150.876f, 21.9f));
		

	}
}

@FunctionalInterface
interface Sayable {
	void say();
}
