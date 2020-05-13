package com.values;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {

	public static void main(String[] args) {
		
		 lambda();
		 
		 System.out.println("+++++++++++++++++++");

		String[] name = { "Apple", "Sony", "Pioneer", "Sony", "Samsung" };

		Set<String> dup = new HashSet<>();

		for (String gg : name) {

			if (dup.add(gg) == false) {

				System.out.println(gg);

			}

		}

	}
public static void lambda() {
	
	List<String> name=new ArrayList<>();
	
	name.add("John");
	name.add("Shujon");
	name.add("Company");
	name.add("The Biggest");
	
	name.forEach(list ->{
		System.out.println(list);
	});
	
	
	
}
}
