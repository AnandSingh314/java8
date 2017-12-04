package com.practice.functionalinterface;

public class First {

	public static void main(String[] args) {

		// declare
		Activity run;

		// default call errors here.
		// run.method();

		// initializations
		run = () -> ("run......!");

		// default method activated
		run.method();

		System.out.println(run.act());
	}

}

@FunctionalInterface
interface Activity {
	String act();

	// only 1 abstract method allowed.
	// private String perform();

	// default method allowed, but defualt should have the implementations

	default void method() {
		System.out.println("this is default acting");
	}
	
}
