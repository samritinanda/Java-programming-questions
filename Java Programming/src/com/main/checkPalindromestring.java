package com.main;

import java.util.Scanner;

public class checkPalindromestring {
	public static void main(String[]args){
		String original;
	  String reversestring;
	 Scanner in =new Scanner(System.in);
	 System.out.println("Enter the String");
	 original=in.nextLine();
	StringBuilder rs =new StringBuilder(original).reverse();
	  if(original.equals(rs.toString())){
		  System.out.println("String is Palindrome");}
	  
		  else
		  {
			  System.out.println("String is not Palindrome");
			  
		  }
		 
	  }
		  
	  
	 
	 
	


}
