package com.practice.lambdafunction;

public class FifthWithReturnType {
	public static void main(String[] args) {
		Playable animalSound = (s) -> {
			String sound = "no sound";
			switch (s.toUpperCase()) {
			case "DOG":
				sound= "bark bark";
				break;
			case "CAT":
				sound = "meeee....ooowwww";
				break;
			case "SNAKE":
				sound =  "fiss fiss";
				break;
			default:
				break;
			}
			return sound;
		};
		
		System.out.println(animalSound.play(""));
		System.out.println(animalSound.play("cat"));;
		System.out.println(animalSound.play("dog"));;
		
		
		Playable2 dog = ()->{return "bhao bhao..";};
		Playable2 cat = ()->("meeaaaaaoooowwww."); // without return keyword
		
		System.out.println(dog.sound());
		System.out.println(cat.sound());		
		
	}
}

interface Playable {
	String play(String animal);
}
interface Playable2 {
	String sound();
}
