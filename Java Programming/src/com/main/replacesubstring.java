package com.main;


public class replacesubstring {
	public static void main (String[]args){
	    String word1= "This is a Demo";
		String word2= "";
		String word3 ="for";
		word2 = word1.substring(7, 9);
		System.out.println(word2);
		
		System.out.println(word2.replace("a",word3));
	}

}
