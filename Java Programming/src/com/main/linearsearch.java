package com.main;

public class linearsearch {
static int valueoftargetelement(int[]array,int targetvalue){
	for(int i=0;i<array.length;i++){
		if(array[i]==targetvalue)
			return i;
		
	}
	return -1;
	}
 public	static void main(String[]args){
		
		int[] meint =  new int[] {7,6,5,2,8};
		System.out.println(meint[2]);
		
	}
			
}
