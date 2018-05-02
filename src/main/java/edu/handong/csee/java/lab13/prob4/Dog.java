package edu.handong.csee.java.lab13.prob4;

public class Dog extends Animal implements Pet{ // declare class that inherits from Animal class and implement method for Pet
	public String food() { // declare method which returns string
		return "(Dog!)" + "Sausage"; // print message
	}
}
