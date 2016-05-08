package com.main;

public class merge2arrays {
	
	public static void main(String[]args){
int array1[]={1,3,5,7};
int array2[]={2,6,8,9};
int[]outputarray = new int[array1.length+array2.length];
int m = array1.length;
int n= array2.length;
int i =0,j=0,k=0;
while (i<m && j<n)
{
	if(array1[i]<array2[j])
	{
		
		outputarray[k++] = array1[i++];
		}
	else
	{ 
	outputarray[k++]= array2[j++];
	
	}
	
}
while(i<m){
	outputarray[k++] = array1[i++];
}
while(j<n){
	outputarray[k++]=array2[j++];
}

	}
}



	

