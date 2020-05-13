package com.array;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrWithIterator {

	public static void main(String[] args) {

		List<Integer> mm = new ArrayList<>();

		mm.add(10);
		mm.add(30);
		mm.add(60);
		mm.add(90);

		System.out.println(mm);

		Iterator<Integer> dd = mm.iterator(); // While loop

		while (dd.hasNext()) {

			System.out.println(dd.next());
			// System.out.println(""); // For creating gap

		}
		
		
		List<String> name=new ArrayList<>();
		
		name.add("John");
		name.add("Shujon");
		name.add("Love");
		name.add("America");
		
		Iterator<String> qq=name.iterator();
		
		while(qq.hasNext()) {
			
			System.out.println(qq.next());
			
			
		}
		getKeyValue();
	}
	
	public static void getKeyValue() {
		 
		Hashtable<Integer,String> ob1=new Hashtable<>();
		
		ob1.put(0, "Clorox");
		ob1.put(1, "Lysol");
		ob1.put(2, "Savlon");
		ob1.put(3, "Datol");
		ob1.put(4, "Purell");
		
		for(Map.Entry yy:ob1.entrySet() ) {
			
			System.out.println(yy.getKey()+"="+yy.getValue());
		}
		
		
		
	}
	

}
