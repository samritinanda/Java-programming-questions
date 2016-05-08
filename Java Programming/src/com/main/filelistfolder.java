package com.main;

import java.io.File;

public class filelistfolder {
public static void main(String[]args){
	
	File file= new File("C:\\java") ;
	String[]files= file.list();
	for(String string:files){
		System.out.println(string);
	}
		
	
}
}

