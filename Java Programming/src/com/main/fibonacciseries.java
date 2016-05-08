package com.main;

import java.util.Scanner;

public class fibonacciseries {
	
	public static void main(String[]args){
		int first=0;
		int second=1;
		int next;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of terms for fibonicci series");
		int numberofterms=scanner.nextInt();
		System.out.println(first+","+second);
		for(int count =3;count<=numberofterms;count++){
			next=first+second;
			System.out.println(","+next);
			first=second;
			second=next;
			
			
		}
	
		
	}
	

}
