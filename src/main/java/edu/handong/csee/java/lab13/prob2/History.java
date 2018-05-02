package edu.handong.csee.java.lab13.prob2;

public class History extends Book{ // declare class which inherits from Book class
	private String Author; // set Author as private string
	public History(String Name, String Author){ // constructor which receives two strings
		super(Name); // set the name of the instance using book's constructor
		this.Author = Author; // set the author's name of as Author
	}
	public String toString() { // declare method which returns string
		return super.toString() + "\n\tAuthor: " + Author; // return result of Book class's toString method and author
	}
	public void show() { // declare method
		System.out.println("<<<History>>>" + this.toString()); // print History and the return of toString method
	}

}
