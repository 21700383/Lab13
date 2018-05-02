package edu.handong.csee.java.lab13.prob1;

public class prob1 { // delcare class

	public static void main(String[] args) { // declare main method
		// TODO Auto-generated method stub
		Friend friend1 = new Friend(); // create new instance of Friend and call it friend1
		SchoolFriend friend2 = new SchoolFriend(); // create new instance of SchoolFriend and call it friend2
		ClassFriend friend3 = new ClassFriend(); // create new instance of ClassFriend and call it friend3
	
		InstanceOf.WhatFriend(friend1); // run WhatFriend method from InstanceOf class for friend1
		InstanceOf.WhatFriend(friend2); // run WhatFriend method from InstanceOf class for friend2
		InstanceOf.WhatFriend(friend3); // run WhatFriend method from InstanceOf class for friend3
	}

}
