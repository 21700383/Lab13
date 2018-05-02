package edu.handong.csee.java.lab13.prob6;

public class Printer { // declare class
	public static void print(Object object) { // declare method which has 1 input
		String str = object.toString(); // set str as string as the value as object's result of toString method
		if(object instanceof CapitalPrintable) // if object is instance of CapitalPrintable
			str = str.toUpperCase(); // str is result of str's toUpperCase method
		System.out.println(str); // print str to the system
	}
}
