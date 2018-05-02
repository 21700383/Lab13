package edu.handong.csee.java.lab13.prob3;

public class Rectangle extends Shape{ // declare method which inherits from abstract class
	private double length; // declare length as private double
	private double width; // declare width as private double
	public Rectangle(double length, double width) { // declare constructor which receives two doubles
		this.length = length; // set the class's length as input length
		this.width = width; // set the class's width as input width
	}
	public double area() { // declare method which returns double
		return length * width; // return result of multiplying 2 variables
	}
	public double perimeter() { // declare method which returns double
		return 2*(length+width); // return result of multiplying result of adding 2 variables by 2
	}
	public double get_Length() { // declare method which returns double
		return length; // return value of length
	}
	public double get_Width() { // declare method which returns double
		return width; // return value of width
	}
}
