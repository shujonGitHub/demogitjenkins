package com.array;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] a = new int[3];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		System.out.println(a[2]); // For individual call

		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

			// System.out.println(a[2]);

		}
		collectOne();
		System.out.println("++++++++++++++++++");
		collectTwo();
	}

	public static void collectOne() {

		String[] name = {"Samsung","Sony","Pioneer"};

		System.out.println(Arrays.toString(name));

		for (String gg : name) {
			
			System.out.println(gg);

		}

	}

	public static void collectTwo() {

		String company[][] = { { "Dell","Hp","Asus","Acer","Mac" },

				{"MatLife","IBM","Motorolla","Honda","Toyota"}, {"NY","WA","SA","PA","MN"} };

		for (int r = 0; r < 3; r++) {

			for (int c = 0; c < 5; c++) {

				System.out.println(" " + company[r][c]);

			}
			System.out.println(" ");
		}
	}

}
