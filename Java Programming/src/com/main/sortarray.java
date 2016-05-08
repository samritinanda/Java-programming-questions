package com.main;

public class sortarray {
	public static void main(String[]args){
		int[]array ={8,5,3,2,9};
		int temp;
		boolean swapped=false;
		while(swapped==false){
		swapped=true;
		for(int i=0;i<array.length-1;i++)
			if(array[i]>array[i+1]){
				temp =array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
				swapped=false;
			}
			
		}
		
	
for(int i=0;i<array.length;i++){
	System.out.println(array[i]);
}
}
}
