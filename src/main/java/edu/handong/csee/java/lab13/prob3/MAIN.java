package edu.handong.csee.java.lab13.prob3;

import java.util.Scanner; // import scanner utility to get user input

public class MAIN { // declare class

	public static void main(String[] args) { // declare main class
		double n1, n2; // set n1 and n2 as double
		Scanner keyboard = new Scanner (System.in); // create instance of Scanner and call it as keyboard
		
		System.out.print("Enter radius: "); // print message to tell user to input radius
		n1 = keyboard.nextDouble(); // put user input to n1
		Circle c1 = new Circle(n1); // create new instance of Circle and call it c1
		
		System.out.println("Radius: " + c1.get_Radius()); // print result of c1's get_Radius method
		c1.display(); // run display method
		
		System.out.print("Enter length and width: "); // print message to tell user to input length and width
		n1 = keyboard.nextDouble(); // put user input to n1
		n2 = keyboard.nextDouble(); // put user input to n2
		Rectangle r1 = new Rectangle(n1, n2); // create new instance of Rectangle as r1
		
		System.out.println("Length: " + r1.get_Length()); // print the result of r1's get_Length method
		System.out.println("Width: " + r1.get_Width()); // print the result of r1's get_Width method
		r1.display(); // run display method
	}
}
