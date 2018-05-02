package edu.handong.csee.java.lab13.prob2;

public class Book { // declare class
	private static int idCount = 0; // set idCount as private static integer number and initialize as 0
	private String BookName; // set BookName as private String
	private int id; // set id as private integer
	public Book(String Name) { // declare constructor which receives a string
		this.BookName = Name; // set the instance's BookName as the string
		idCount++; // increase idCount by 1
		id = idCount; // get id from idCount
	}
	public String toString() { // declare method which returns string
		return "\n\tId: " + id + "\n\tBook Name: " + BookName; // return message of id and book name
	}
	public void show() { // declare method
		System.out.println("<<<BOOK>>>" + this.toString()); // print the details of book using toString method for this instance's data
	}
}
