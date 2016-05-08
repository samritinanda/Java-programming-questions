package com.main;

public class swapusingthirdvariable {
	public static void main(String[]args){
		int a= 10;
		int b= 20;
		int temp;
		
		//before
		System.out.println("a value is"+a+ "b value is"+b );
		//swap
		temp=a; 
		a=b;//a=20
		b=temp;  //b=10
		System.out.println("a swap value"+a+"b swap value is"+b);
		
	}

}
