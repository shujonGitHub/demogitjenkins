package com.validation;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

public class AsserDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your Age Please");
		
		int value= scanner.nextInt();
		
		assert value<=18 : "valid";
		
		//  wrong =  --->  assert.assertEquals(10==kdk);
		
		System.out.println("Your age is  "+ value);
		
		
		
		
		
		
		
		
		
		

	}

}
