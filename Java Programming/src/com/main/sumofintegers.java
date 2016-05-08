package com.main;

import java.util.Scanner;

public class sumofintegers {
public static void main(String[]args){
	int fnum,snum,answer;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the First Number");
	fnum=sc.nextInt();
	System.out.println("Enter the Next Number");
	snum=sc.nextInt();
	answer=fnum+snum;
	System.out.println("The Answer is"+answer);
	
	
}
}
