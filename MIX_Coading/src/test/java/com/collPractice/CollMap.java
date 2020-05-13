package com.collPractice;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class CollMap {

	public static void main(String[] args) {
		
		getTable();

		TreeMap<Integer, String> ss = new TreeMap<>();

		ss.put(1, "Shujon");
		ss.put(2, "Towhid");
		ss.put(3, "Honey");
		ss.put(4, "Funny");
		ss.put(5, "Trump");

		System.out.println(ss.get(2));

		System.out.println("+++++++++++++++++++++++++++++++");

		for (Map.Entry mm : ss.entrySet()) {

			System.out.println(mm.getKey() + "=" + mm.getValue());

		}
		
	}
	
	public static void getTable() {
		
	Hashtable<Integer,String>rr=new Hashtable<>();
	
	rr.put(5,"Apple");
	rr.put(6,"Sony");
	rr.put(7,"Samsung");
	rr.put(8,"Pioneer");
	rr.put(9,"JVC");
	
	System.out.println(rr);
		System.out.println(rr.get(7));
		
		
		
	}

}
