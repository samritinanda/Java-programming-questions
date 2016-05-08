package com.main;

import java.util.Scanner;

public class factorialwithoutrecursion {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number= scanner.nextInt();
		int result=1;
		if(number<=0){
			
		
			result=1;
		}
		else{
			for(int i=1;i<=number;i++){
				result= result*i;
				
			}
			
				
		}
		System.out.println("The Factorial of number is"+result);
	}

}
