package com.simplilearn.io;

import java.io.File;
import java.io.IOException;

public class Lab1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("sb011.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
	}

}
