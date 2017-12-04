package com.practice.lambdafunction;

public class FirstThreadAndRunnable {
	public static void main(String[] args) {
		
		Thread th = new Thread(()->{
			System.out.println("this is my first lambda expression");
		});
		
		th.start();
	
		
		Runnable runnable = ()->{System.out.println("this is runnable thread");};
		runnable.run();
	}
}

