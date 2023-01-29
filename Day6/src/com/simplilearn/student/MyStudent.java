package com.simplilearn.student;
import com.simplilearn.colllege.*;

public class MyStudent {

	public static void main(String[] args) {
		
		System.out.println("I am student , Name is : Rachana.K ");
		// I want to have Rachana college name also
		
		
		// 1. create the object
		
		// Syntex : <class name >   object name = new <class name > ();
		
		MyCollege  mycollege = new MyCollege();
		
		//2. Call the method
		
		mycollege.getCollegeName();
		
	}
}
