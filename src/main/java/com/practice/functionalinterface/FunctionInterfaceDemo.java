package com.practice.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "john", "deep", "987-234"));
		people.add(new Person(3, "charlie", "pappu",  "987-765"));
		people.add(new Person(5, "denie", "woose", "567-235"));
		people.add(new Person(2, "Bob", "tappu", "756-438"));
		
		Function<Person, String> getFName = (p)->(p.fname); // this functional code give name of a person
		Function<Person, String> getPhone = (p)->(p.phone); // this functional code give phone of a person
		Function<Person, String> getFLName = (p)->(p.fname+" "+p.lname); // this functional code give full name of a person
	
		Function<String, String> captilize = (s)->(s.toUpperCase());
		Function<String, String> spaceToUnderscore = (s)-> (s.replace(' ', '_'));
	
		Function<Person,Person> addCountryCode = (p)->{p.phone="(+91) "+p.phone; return p;};
		
		// apply getFName function
		applyFunctionOnPeople(people, getFName);
		System.out.println("------------------------------");
		// apply getFLName function
		applyFunctionOnPeople(people, getFLName);

		System.out.println("------------------------------");
		// apply getFName function andThen capitalize the name
		applyFunctionOnPeople(people, getFName.andThen(captilize));
		
		System.out.println("------------------------------");
		// apply get phone function but add country code before getting it
		applyFunctionOnPeople(people, getPhone.compose(addCountryCode));

		System.out.println("------------------------------");
		// apply identity function.
		applyFunctionOnPeople(people, Function.identity());

		
	}
	
	static void applyFunctionOnPeople(List<Person> people, Function<Person,?> function){
		for(Person p : people)
			System.out.println(function.apply(p));
	}

}

@FunctionalInterface
interface SimpleFuncInterface {
	public void doWork();
	public String toString();
	public boolean equals(Object o);
}

