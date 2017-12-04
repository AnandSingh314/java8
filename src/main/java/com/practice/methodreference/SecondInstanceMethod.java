package com.practice.methodreference;

import java.util.function.BiFunction;

public class SecondInstanceMethod {

	// method shouldn't have input argument
	public void saySomething() {
		System.out.println("object.method is saying something....");
	}

	public int add(int a, int b) {
		return a + b;
	}

	public float add(int a, float b) {
		return a + b;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		SecondInstanceMethod sim = new SecondInstanceMethod();
		
		// object instance reference
		Sayable stt = sim::saySomething;
		stt.say();

		// passing in method param
		Thread t = new Thread(sim::saySomething);
		t.start();

		/*
		 * use of java.util.function package Interface abstract method signature
		 * should match to the referenced method.
		 * 
		 * BiFunction<arg1, arg2, returnType>
		 */
		BiFunction<Integer, Integer, Integer> adder = sim::add;
		BiFunction<Integer, Float, Float> adder2 = sim::add;
		BiFunction<Float, Float, Float> adder3 = sim::add;

		System.out.println("Adder : " + adder.apply(10, 299));
		System.out.println("Adder2 : " + adder2.apply(10, 299.23f));
		System.out.println("Adder3 : " + adder3.apply(150.876f, 21.9f));

	}

}

@FunctionalInterface
interface Talkable {
	void talk();
}
