package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class copyingfile {
	public static void main(String[]args){
		File source= new File("C:\\Users\\abishake\\march\\Java Programming\\sourcefolder\\demo.txt");
		File destination= new File("C:\\Users\\abishake\\march\\Java Programming\\destinationfolder\\demo.txt");
		BufferedReader reader;
		PrintWriter writer;
		String line;
		try{
		if(destination.createNewFile()||!destination.createNewFile()){
			reader = new BufferedReader (new FileReader(source));
			writer = new PrintWriter(new FileWriter(destination));
			while((line= reader.readLine())!=null){
			writer.println(line);	
				
			}
			reader.close();
			writer.close();
		}
		}
			
		catch(IOException ioex){
			System.out.println("I could not copy the file to destination");
			
			
			
		}
		
	}
}

			
		
		

	


