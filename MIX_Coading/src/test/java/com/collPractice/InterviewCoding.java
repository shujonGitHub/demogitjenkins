package com.collPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewCoding {

	public static void main(String[] args) {

		int[] ob = new int[5];

		ob[0] = 10;
		ob[1] = 20;
		ob[2] = 30;
		ob[3] = 40;
		ob[4] = 50;

		System.out.println(Arrays.toString(ob));
		System.out.println(ob[1]);

		List<Integer> bb = new ArrayList<>();

		bb.add(200);
		bb.add(300);
		bb.add(400);
		bb.add(500);
		bb.add(600);

		// System.out.println(bb);

		for (int i = 0; i < bb.size(); i++) {

			System.out.println(bb.get(i));

		}

		/*
		 * for(int gg:bb) { System.out.println(gg);
		 * 
		 * }
		 */

		int maximumNumber = Collections.max(bb);

		System.out.println(maximumNumber);

		Collections.reverse(bb);

		System.out.println(bb);
		secondHigest();

	}
	
	public static void secondHigest() {
		
		int num[]= {25,35,45,55,65};
		
		int totalSize =num.length;
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		int seNum=num[totalSize-2];
		
		System.out.println(seNum);
	     
	
	
	
	
	
	
	
	
	
	
	}

}
