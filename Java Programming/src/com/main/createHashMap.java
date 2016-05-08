package com.main;

import java.util.HashMap;
import java.util.Set;

public class createHashMap {
	public static void main(String[]args){
		HashMap<Integer,String> hashmap = new HashMap<>();
		hashmap.put(1, "ball");
		hashmap.put(2, "apples");
		hashmap.put(3, "oranges");
		System.out.println("hashmap:"+hashmap);
		
		Set<Integer>set =hashmap.keySet();
		System.out.println("set:"+set);
		System.out.println("--------------");

		System.out.println("key" +"|"+"value");
		System.out.println("--------------");
		for(Integer key:set)
		{
			String value = hashmap.get(key);
			System.out.println(key+"|"+value);
		}
		}
		
		
	}


