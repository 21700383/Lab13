package edu.handong.csee.java.lab13.prob4;

public class Animal { // declare method
	private String name; // set name as private string
	public void setName(String name) { // declare method with 1 input
		this.name = name; // get value for the class' name from input
	}
	public void getName() { // declare method
		System.out.println("Name: " + name); // print name of the class
	}
}

