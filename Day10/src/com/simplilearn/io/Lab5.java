package com.simplilearn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lab5 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fr= new FileWriter("Lab41.txt",false);
		fr.write("achieve their learning objectives after successful course completion1");
		fr.write("\n");
		System.out.println("File writing done");
		
		
		fr.flush();
		fr.close();
		
		
	}

}
