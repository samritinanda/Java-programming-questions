package com.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class findduplicateelement {
	public static void main (String[]args){
		ArrayList<String> names = new ArrayList<>();
		names.add("Aadit");
		names.add("Samriti");
		names.add("Sahil");
		names.add("Samriti");
		names.add("Aadit");
				
	Set<String>	s= new HashSet<>();
	for(String name :names){
		if(s.add(name)==false)
			System.out.println(name);
			
			
			
			}
	
		
			
		
	}
	
				
		
		
	}


