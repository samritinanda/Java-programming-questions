package com.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;



public class countoccurencewordsinfile {
	
	

	public static void main(String[]args) throws IOException {
		FileInputStream fin = new FileInputStream("javaprogram.txt");
		Scanner fileInput = new Scanner(fin);
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		while(fileInput.hasNext()){
			String nextword=fileInput.next();
			if(words.contains(nextword)){
				int index=words.indexOf(nextword);
				count.set(index,count.get(index)+1);
			}
			else{
				words.add(nextword);
				count.add(1);
			}
			
		}
			fileInput.close();
			fin.close();
			
			for(int i=0; i<words.size();i++){
				System.out.println(words.get(i) +"occurred" + count.get(i)+"time(s)");
			}
			
			
		}
	}


		
	
		



