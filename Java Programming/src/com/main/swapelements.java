package com.main;

public class swapelements {
	public static void main(String[]args){
		int[]numbers={1,2,5,6,4};
		int src=2;
		int dest=4;
		int temp = numbers[src];
		
		numbers[src]=numbers[dest];
		numbers[dest]=temp;
		
for(int position=0;position<numbers.length;position++)
	System.out.println(numbers[position]);


}
}
