package edu.handong.csee.java.lab13.prob4;

import java.util.Scanner; // import Scanner utility to get user input

public class Master { // declare class
	public void feed(Pet pet) { // declare method
		System.out.println("feed: " + pet.food()); // print result of food method from pet interface
	}

	public static void main(String[] args) { // declare main method
		String cat_name, dog_name; // set cat_name and dog_name as string
		
		Master master = new Master(); // create new instance of Master as master
		Cat cat = new Cat(); // create new instance of Cat as cat
		Dog dog = new Dog(); // create new instance of Dog as dog
		
		Scanner keyboard = new Scanner(System.in); // create new instance of Scanner as keyboard
		System.out.print("Enter the cat name and dog name: "); // print message to tell user to input cat and dog name
		cat_name = keyboard.next(); // put user input into cat_name
		dog_name = keyboard.next(); // put user input into dog_name
		
		cat.setName(cat_name); // run setName method for cat
		cat.getName(); // run getName method for cat
		master.feed(cat); // run feed method for cat instance
		
		dog.setName(dog_name); // run setName method for dog
		dog.getName(); // run getName method for dog
		master.feed(dog); // run feed method for dog instance
	}
}
