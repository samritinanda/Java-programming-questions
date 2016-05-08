package com.main;

import java.util.HashSet;
import java.util.Set;

public class FullName {
private String first,last;
public FullName(String first,String last){
	this.first=first;
	this.last=last;
	
}
@Override

public boolean equals(Object o){
if(!(o instanceof FullName))return false;
FullName f=(FullName)o;
return first.equals(f.first)&&last.equals(f.last);
	
}
@Override
public int hashCode(){
	return 31*first.hashCode()+last.hashCode();
}
public static void main (String[]args){
	Set<FullName>s = new HashSet<FullName>();
	s.add(new FullName("Samriti","Nanda"));
	System.out.println(s.contains(new FullName("Samriti","Nanda")));
	
	
	
}

}
		


