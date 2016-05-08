package com.main;

public class convertstring {
	public static void main(String[]args){
		
		String sampleString ="This is nice" ;
		System.out.println("before:"+sampleString);
		sampleString=sampleString.replaceAll("This is nice","This1 is2 nice3");
		System.out.println("after:"+sampleString);
				
		
	}

}