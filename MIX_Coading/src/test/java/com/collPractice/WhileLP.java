package com.collPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileLP {

	public static void main(String[] args) {

		List<Integer> xx = new ArrayList<>();

		xx.add(6);
		xx.add(10);
		xx.add(15);
		xx.add(20);
		xx.add(30);

		System.out.println(xx);

		Iterator<Integer> yy = xx.iterator();  //While Loop

		while (yy.hasNext()) {

			System.out.println(yy.next());

		}

	}

}
