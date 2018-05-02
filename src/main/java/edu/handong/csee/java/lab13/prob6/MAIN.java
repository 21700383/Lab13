package edu.handong.csee.java.lab13.prob6;

public class MAIN { // declare class

	public static void main(String[] args) { // declare main method
		// TODO Auto-generated method stub
		UpPoint p1 = new UpPoint(3,3); // create new instance of UpPoint as p1
		DownPoint p2 = new DownPoint(2,5); // create new instance of DownPoint as p2
		DownPoint p3 = new DownPoint(4,7); // create new instance of DownPoint as p3
		UpPoint p4 = new UpPoint(9,12); // create new instance of UpPoint as p4
		Printer.print(p1); // print p1 using print method is Printer class
		Printer.print(p2); // print p2 using print method is Printer class
		Printer.print(p3); // print p3 using print method is Printer class
		Printer.print(p4); // print p4 using print method is Printer class
	}

}
