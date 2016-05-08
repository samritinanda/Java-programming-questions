package com.main;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class substract2integers {
public static void main(String[]args) {
	BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
	int val1 =0;
	int val2 =0;
	
	
		System.out.println("Enter first value integer:");
		
			
					try {
						val1=Integer.parseInt(Br.readLine());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
		
		System.out.println("Enter second value integer:");
		
		try {
			val2=Integer.parseInt(Br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(" difference of two ineger:" +(+val1 - +val2));
	}
	
	
	
}


