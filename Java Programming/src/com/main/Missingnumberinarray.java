package com.main;

public class Missingnumberinarray {
	static int sumofnumbers (int n){
		int sum=(n*(n+1))/2;
		
		return sum;
	}


static int sumofelements(int []array){
	int sum=0;
	for(int i=0;i<array.length;i++){
		sum=sum+array[i];
	}
	return sum;
}
	

public static void main(String[]args){
	int n=8;
	int []array={1,4,5,3,7,8,6};
	int sumofnumbers=sumofnumbers(n);
	int sumofelements=sumofelements(array);
	
	int missingnumber=sumofnumbers-sumofelements;
	System.out.println("missingnumber="+missingnumber);
	
}
}