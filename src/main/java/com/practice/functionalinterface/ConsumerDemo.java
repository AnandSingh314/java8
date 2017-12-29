package com.practice.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("John");
		nameList.add("Abhraham");
		nameList.add("Denny");
		nameList.add("Jonny");
		nameList.add("David");
		
		Consumer<String> printFun = (s)->{System.out.println(s);};
		Consumer<String> printCapsFun = (s)->{System.out.println(s.toUpperCase());};
		Consumer<String> printfFun = (s)->{System.out.printf(s);};
		
		applyOnList(nameList, printFun);
		
		System.out.println("-----------------");
		applyOnList(nameList, printCapsFun);

		System.out.println("-----------------");
		applyOnList(nameList, printfFun);
		System.out.println("");
		applyOnList(nameList, printfFun.andThen(s->{System.out.println();}));

		
		
	}
	
	static void applyOnList(List<String> list, Consumer<String> consumer){
		for(String s: list)
			consumer.accept(s);
	}

	
}


