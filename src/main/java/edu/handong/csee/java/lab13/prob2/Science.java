package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{ // declare method which inherits class Book
	private String publisher; // set publisher as private String
	public Science(String Name, String Publisher) { // constructor which receives two string
		super(Name); // set the Name of the book using Book class's constructor
		this.publisher = Publisher; // set this instance's publisher as the Publisher
	}
	public String toString() { // declare method which returns string
		return super.toString()+ "\n\tPublisher: " + publisher; // return book's id and name
	}
	public void show() { // declare method
		System.out.println("<<<Science>>>" + this.toString()); // print Science and the returned data from toString method
	}
}
