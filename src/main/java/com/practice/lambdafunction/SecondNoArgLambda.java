package com.practice.lambdafunction;

public class SecondNoArgLambda {
	public static void main(String[] args) {
		// using anonymous
		Drawable image = new Drawable() {
			@Override
			public void draw() {
				System.out.println("drawing with anonymous class");
			}
		};
		
		image.draw();
		
		// using lambda expression
		System.out.println("now using lambdas");		
		Drawable image2 = ()->{System.out.println("drawing with lambdas");};
		image2.draw();
	}
}

interface Drawable {
	void draw();
}
