package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner; // import Scanner utility to get user input

public class EqualEquation { // declare class
	public static boolean equals(int[][] m1, int[][] m2) { // declare method which has 2 input and returns true/false
		int count = 0; // set count as integer and its value as 0
		if (m1.length != m2.length) // if the number of rows for 2 input is different
		return false; // return false
		for (int i = 0; i < m1.length; i++) { // loop for number of m1's length
			for (int j = 0; j < m1[i].length; j++) { // loop for number of m1[i]'s length{
				if (m1[i][j] != m2[i][j]) // if m1[i][j] and m2[i][j]'s value are not the same
		                count++; // increase count by 1
		            }
		      }
				if(count <= 3) // if count is less or equal to 3
					return true; // return true
		        else // else
		        	return false; // return false
	}
	public static void main(String[] args) { // declare main method
		// TODO Auto-generated method stub
		int n1, n2 = 0; // set values of n1 and n2 as integer and their value as 0
		Scanner keyboard = new Scanner(System.in); // create new instance of Scanner as keyboard
		System.out.print("Enter row size(maximum 5): "); // print message to tell user to enter row size
		n1 = keyboard.nextInt(); // put user input to n1
		System.out.print("Enter column size(maximum 5): "); // print message to tell user to enter column size
		n2 = keyboard.nextInt();// put user input to n2
		int[][] m1 = new int[n1][n2]; // create new integer array as m1 using n1 and n2
		System.out.print("Enter row size(maximum 5): "); // print message to tell user to enter row size
		n1 = keyboard.nextInt(); // put user input to n1
		System.out.print("Enter column size(maximum 5): "); // print message to tell user to enter column size
		n2 = keyboard.nextInt();// put user input to n2
		int[][] m2 = new int[n1][n2]; // create new integer array as m2 using n1 and n2
		    System.out.print("Enter List1: "); // print message to tell user to enter List1
		    for (int i = 0; i < m1.length; i++)  // loop until reaching m1's length
		    	for (int j = 0; j < m1[i].length; j++) // loop until reaching m1[i]'s length
		    		m1[i][j] = keyboard.nextInt(); // put user input to m1[i][j]
		    System.out.print("Enter list2: "); // print message to tell user to enter List2
		    for (int i = 0; i < m2.length; i++){ // loop until reaching m2's length
		       for (int j = 0; j < m2[i].length; j++) // loop until reaching m2[i]'s length
		    	   m2[i][j] = keyboard.nextInt(); // put user input to m2[i][j]
		    }
		    for (int i = 0; i < m1.length; i++){ // loop until reaching m1's length
		       for (int j = 0; j < m1[i].length; j++) // loop until reaching m1[i]'s length
		    	   System.out.print(m1[i][j] + " "); // print m1[i][j] and a space
		       	   System.out.println(); // print enter
		    }
		    System.out.println();
		    for (int i = 0; i < m2.length; i++){ // loop until reaching m2's length
		       for (int j = 0; j < m2[i].length; j++) // loop until reaching m2[i]'s length
		         System.out.print(m2[i][j] + " "); // print m2[i][j] and a space
		       System.out.println(); // print enter
		    }
		    System.out.println(); // print enter
		                  
		        
		       if (equals(m1, m2)) // if the result of running equals method is true
		       	System.out.println("The two arrays are approximately identical."); // print message
		       else // else if the result is false
		       	System.out.println("The two arrays are not identical"); // print message
	}

}
