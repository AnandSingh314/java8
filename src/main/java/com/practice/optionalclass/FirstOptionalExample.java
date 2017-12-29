package com.practice.optionalclass;

import java.util.Optional;

public class FirstOptionalExample {

	public static void main(String[] args) {

		String str = null;
		String str1 = "";
		String str2 = "Anand";

		System.out.println(Optional.ofNullable(str));
		System.out.println(Optional.ofNullable(str1));
		System.out.println(Optional.ofNullable(str2));

		System.out.println("----------------------------------");
		System.out.println(Optional.ofNullable(str).isPresent());
		System.out.println(Optional.ofNullable(str1).isPresent());
		System.out.println(Optional.ofNullable(str2).isPresent());

		System.out.println("----------------------------------");
		Optional.ofNullable(str).ifPresent(System.out::println);
		Optional.ofNullable(str1).ifPresent(System.out::println);
		Optional.ofNullable(str2).ifPresent(System.out::println);
		
		System.out.println("----------------------------------");
		System.out.println(Optional.ofNullable(str).orElse("value is not present"));
		System.out.println(Optional.ofNullable(str1).orElse("value is not present"));
		System.out.println(Optional.ofNullable(str2).orElse("value is not present"));
		
		System.out.println("----------------------------------");
		System.out.println(Optional.ofNullable(str).hashCode());
		System.out.println(Optional.ofNullable(str1).hashCode());
		System.out.println(Optional.ofNullable(str2).hashCode());
		
	}

}
