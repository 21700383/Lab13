package edu.handong.csee.java.lab13.prob1;

public class InstanceOf { // declare class
	public static void WhatFriend(Friend friend) //declare method, which takes variable friend
	{
		if(friend instanceof ClassFriend) // if friend is instance of ClassFriend
			((ClassFriend)friend).classFriend(); // run classFriend method
		else if (friend instanceof SchoolFriend) // else if friend is instance of SchoolFriend
			((SchoolFriend)friend).schoolFriend(); // run schoolFriend method
		else // if friend is not instance of ClassFriend or SchoolFriend
			friend.JustFriend(); // run method JustFriend
	}
}
