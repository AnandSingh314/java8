package com.practice.lambdafunction;

public class ThirdOneArgLambda {

	public static void main(String[] args) {
		String stt = "This is second lambda with 1 arg.";
		Sayable sayable = (e)->{System.out.println("Greeting: "+e);};
		sayable.say(stt);
		
		
	}

}

interface Sayable {
	void say(String msg);
}


