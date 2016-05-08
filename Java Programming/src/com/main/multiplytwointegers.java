package com.main;

import java.io.DataInputStream;
import java.io.IOException;

public class multiplytwointegers {


public static void main(String[]args){
	DataInputStream dis = new DataInputStream(System.in);
	
int a=0;
int b= 0;
	

		try {
			System.out.println("Enter the  value integer a=");
			
			a=Integer.parseInt(dis.readLine());
			System.out.println("Enter the  value integer b=");
			b=Integer.parseInt( dis.readLine());
			int mult= a *b;
			System.out.println("multiplication of two variables is"+ mult);
		} 
		catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	} 
	
	
}

