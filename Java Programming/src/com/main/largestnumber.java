package com.main;

public class largestnumber {
	public static void main (String[]args){
		
		
		int []array ={20,70,30,10};
		int temp = array[0];
		for(int i=1;i<array.length;i++){
			if(temp<array[i]){
			temp=array[i];
			
				
			}
			
		}
		
				
		System.out.println(temp);
		
		
		
	
	
	
	
	}

}
