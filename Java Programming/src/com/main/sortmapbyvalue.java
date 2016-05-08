package com.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class sortmapbyvalue {
	public static void main(String[]args){
		HashMap <String,Integer>map= new HashMap<>();
		map.put("d", 10);
		map.put("a", 30);
		map.put("c", 50);
		map.put("b", 40);
		map.put("e", 20);
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list= new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list,new Comparator<Map.Entry<String,Integer>>()
				{
			public  int compare (Map.Entry<String,Integer> o1,Map.Entry<String,Integer>o2){
				return (o1.getValue()).compareTo(o2.getValue());
				
			}
			
		});
		for(Map.Entry<String,Integer>entry:list){
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
	}

}
