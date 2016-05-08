package com.main;

public class Swap2numbersinjavawithoutthirdvariable {
public static void main(String[]args){
	int a=20;
	int b= 10;
	
	//before
	System.out.println("a value is"+a+ "b value is"+b );
	//swap
	
	a=a+b;//a=30;
	b=a-b;//b=20;
	a=a-b;//a=10;
	
	
	System.out.println("a swap value"+a+"b swap value is"+b);
}
}
