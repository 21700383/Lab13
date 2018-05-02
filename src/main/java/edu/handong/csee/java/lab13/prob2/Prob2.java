package edu.handong.csee.java.lab13.prob2;

public class Prob2 { // declare class
	public static void main(String[] args) { // declare main method
		Book book = new Book("Simple Book"); // create new instance of Book called book
		Science science = new Science("Hello Physics!", "ScienceWorld"); // create new instance of Science called science
		History history1 = new History("What is love?", "B.D.Hurtme");	// create new instance of History called history1
		History history2 = new History("Her Story", "F.M.Ist"); // create new instance of History called history2
		
		book.show(); // run show method for book
		science.show(); // run show method for science
		history1.show(); // run show method for history1
		history2.show(); // run show method for history2
	}

}
