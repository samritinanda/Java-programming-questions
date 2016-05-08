package com.main;

import java.util.Scanner;

public class reversestring {
	public static void main(String[]args){
	String original,rev ="";
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the String to Reverse");
	original=in.nextLine();
	int len=original.length();
	for(int i=len-1;i>=0;i--)
		rev=rev+original.charAt(i);
	System.out.println("original string is"+original);
	System.out.println("Reverse string is"+rev);
		
		
		
		
		
		
	}
	
	
	
		
		
	}
	


