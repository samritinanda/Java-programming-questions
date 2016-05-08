package com.main;

import java.util.ArrayList;

public class copyarraylisttoarray {
	public static void main(String[]args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		System.out.println("Actual ArrayList"+list);
		String[]strarr= new String[list.size()];
		list.toArray(strarr);
		System.out.println("Copied Array Content");
		for(String str:strarr){
			System.out.println(str);
		}
	}

}
