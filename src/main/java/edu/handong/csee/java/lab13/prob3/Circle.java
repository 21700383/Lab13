package edu.handong.csee.java.lab13.prob3;

public class Circle extends Shape{ // declare class which inherits from Shape class
	private double radius; // set radius as private double
	public Circle(double r) { // declare method with 1 input
		radius = r; // get value of radius from input r
	}
	public double area() { // declare method which returns double
		return Math.PI * Math.pow(radius,  2); // returns result of multiplying pi to radius powered 2
	}
	public double perimeter() { // declare method which returns double
		return 2.0 * Math.PI * radius; //returns result of multiplying 2 to PI to radius 
	}
	public double get_Radius() { // declare method which returns double
		return radius; // return value of radius
	}
}
