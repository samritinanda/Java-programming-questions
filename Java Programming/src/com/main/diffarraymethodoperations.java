package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class diffarraymethodoperations {
public static void main(String[]args){
	//Create an array list
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("S");
	a1.add("A");
	a1.add("M");
	a1.add("R");
	a1.add("I");
	a1.add("T");
	a1.add("I");
	//check whether element is present in list
	boolean blnfound = a1.contains("A");
	System.out.println("Does arraylist contains A?" +blnfound);
	// to get index of specified element
	int index = a1.indexOf("M");
	if(index==-1)
		System.out.println("Arraylist does not contains M");
	else
		System.out.println("Arraylist  contains M at index"+index);	
	
	//Use iterator to display contents of a1
	System.out.print("Original contents of a1:");
	Iterator<String> itr = a1.iterator();
	while(itr.hasNext()){
		String element = itr.next();
		System.out.println(element + "");
	}
	
	
	
	

	ListIterator<String> litr = a1.listIterator();
	while(litr.hasNext()){
		String element = litr.next();
		litr.set(element + "+");
	}
	//now display list backwards
			System.out.println("Print Backwards:");
		while(litr.hasPrevious()){
			String element = litr.previous();
			System.out.print(element +"");
		
		
	}
	
}
}

