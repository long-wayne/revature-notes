package com.revature.scanner;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		//An object is a reusable component within our code.
		//Classes are blueprints of an object, and they define how objects behave.
		
		Scanner scan = new Scanner(System.in); // the new keyword instantiates an object from the Class that's invoked
		
		//prompt the user to enter their name
		System.out.println("Please enter your name.");

		//capture the user's input into a variable called name
		String name = scan.nextLine();
		
		//prompt the user
		System.out.println("What is your age?");
		
		//capture the user's age
		int age = scan.nextInt();
		
		//print the user's name back to the screen with a message
		System.out.println("Hello " + name + ".");
		
		//print back to the user what their age will be in 100 years by invoking a method that we create...
		System.out.println("In the future you, " + name + ", will be " + getFutureAge(age) + " years old.");
		
	}
	
	//public is an access modifier (this method can be accessed anywhere within our application)
	//static = means that I don't need to instantiate this class in order to call this method.
	//int = return type of the method
	//parameter is the data that the method will process
	
	public static int getFutureAge(int currentAge) {
		return currentAge + 100;
	}

}
