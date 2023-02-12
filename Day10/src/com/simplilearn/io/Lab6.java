package com.simplilearn.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lab6 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("Lab41.txt");
		
		FileReader fr = new FileReader(f);
		
		System.out.println("-----------------");
		
		int i = fr.read();
		
		while(i!=-1) {
			System.out.println((char)i);
			 i = fr.read();
		}
		
		
		fr.close();
		
		
	}

}
