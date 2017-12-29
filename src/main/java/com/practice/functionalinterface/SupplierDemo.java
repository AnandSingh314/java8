package com.practice.functionalinterface;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> msgSplr = ()->("Hellow world");
		Supplier<Integer> intSplr = ()->(3456789);
		Supplier<Float> piSplr = ()->(3.14f);
	
		System.out.println("Message: "+msgSplr.get());
		System.out.println("Interger: "+intSplr.get());
		System.out.println("PI vlaue: "+piSplr.get());
		
		
		BooleanSupplier booleanSplr = ()->(true);
		IntSupplier integerSplr = ()->(3456789);
		LongSupplier longSplr = ()->((long)3.14);
			
		System.out.println("Boolean Supplier: "+booleanSplr.getAsBoolean());
		System.out.println("Integer Supplier: "+integerSplr.getAsInt());
		System.out.println("Long Supplier: "+longSplr.getAsLong());
	
	}

}
