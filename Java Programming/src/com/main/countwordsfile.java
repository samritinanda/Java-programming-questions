package com.main;




import java.io.BufferedReader;
import java.io.FileReader;

import java.util.StringTokenizer;

public class countwordsfile {
	
	
	public static void main(String[]args) throws Exception{
		FileReader fr= new FileReader("readwords.txt");
		
		BufferedReader br  = new BufferedReader(fr);
		
		int totalnoofwords =0;
		 String line ;
		while((line =br.readLine())!=null)
		{
			System.out.println("ReadLine"+line);
			StringTokenizer mytokens = new StringTokenizer(line);
			
			
		
		System.out.println("totalnoofwords"+mytokens.countTokens());
				
			
		
			
	}
	}
}
	

		
		
	
	
	
	
	
	
	


