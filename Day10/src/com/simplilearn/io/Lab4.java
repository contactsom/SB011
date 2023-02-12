package com.simplilearn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Lab4 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fr= new FileWriter("Lab4.txt",true);
		fr.write("achieve their learning objectives after successful course completion");
		fr.write("\n");
		System.out.println("File writing done");
		
		
		fr.flush();
		fr.close();
		
		
	}

}
