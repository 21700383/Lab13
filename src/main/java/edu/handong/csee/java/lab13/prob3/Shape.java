package edu.handong.csee.java.lab13.prob3;

public abstract class Shape { // declare abstract class
	public abstract double area(); // declare abstract method
	public abstract double perimeter(); // declare abstract method
	public void display() { // declare method
		System.out.println("Area: " + area() // print area using area method and
		+ "\nPerimeter: " + perimeter() + "\n"); // perimeter using perimeter method and add enter
	}
}
