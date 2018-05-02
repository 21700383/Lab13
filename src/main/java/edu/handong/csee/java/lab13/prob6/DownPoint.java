package edu.handong.csee.java.lab13.prob6;

public class DownPoint { // declare class
	private int x, y; // set x and y as private integer
	DownPoint(int x, int y){ //declare constructor
		this.x = x; // set the class's x as input x
		this.y = y; // set the class's y as input y
	}
	
	public String toString() { // declare method which returns String
		return "x : " + x + " y : " + y; // return x: x's value y: y's value
	}
}

