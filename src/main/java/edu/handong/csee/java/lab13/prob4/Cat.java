package edu.handong.csee.java.lab13.prob4;

public class Cat extends Animal implements Pet{ // declare class that inherits from Animal class and implement method for Pet
	public String food() { // declare method which returns string
		return "(Cat!)" + "Fish"; // print message
	}
}
