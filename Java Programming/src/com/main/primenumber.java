package com.main;

import java.util.Scanner;

public class primenumber {
public static void main(String[]args){
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int input=scan.nextInt();
	boolean isprime=true;
	for(int i=2;i<input;i++)
	
	{
		if(input%i == 0)
		{
		isprime=false;
	} 

}
	if(isprime)
	{
		System.out.println(input+" is prime");
		
	}
	else 
	{
		System.out.println(input+"is not prime");
	}
}
}
