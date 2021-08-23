package com.revature.datatypes;

public class Driver {
	
	// What is the purpose of the main method?
	//The main() method is where the JIT compiler begins program execution.
	//The JIT compiler is part of the JDM
	
	public static void main(String[] args) {
		
		//8 primitive data types
		
		boolean isCool = true; //1 bit of reserved memory - 1 or 0
		byte reallySmallNumber = 127; //8 bits of reserved memory
		short shortNumber = 32467; //16 bits of reserved memory
		char letter = 'm'; //16 bits of memory that represents an ASCII character
		
		int standardNumber = 100; // 32 bits of memory
		float lessPreciseDecimal = 93.2f; // 32 bits of memory with a decimal
		
		double decimal = 145.63; //64 bits of memory allows you to make decimal numbers
		long veryLargeNumber = 12345L; //64 bits of memory
		
		//Since Java 7 you can use an _ for readability for your code:	
		long creditCardNumber = 1234_4567_7890_9874L;
		int secondsInADay = 86_400;
		
		int x = 4;
		int y = 10;
		
		System.out.println(x + y);
		
		//String is NOT a primitive data type. It is technically a class
		String name = "Spongebob";
		
		System.out.println(name + " is " + (x + y * 100) + " years old");
		
		//casting
		
		byte a = 40;
		short b = a; //we have transformed a byte into a short
		int c = b;
		double d = c; //this works because we are doing something called widening 
		
		//widening is when we transform a small data type into a larger data type
		//this is one type of casting
		
		//a double is larger than a integer
		double dub = 900.9;
		int myInt = (int) dub; //we are using NARROW Casting to transform a large datatype to a small one.
		
		System.out.println("The double that has been explicitly cast to an int is now equal to: " + myInt);
		
		//everything above that we've defined are Java Literals,
		//which are simply hard-coded fixed values that we assign to a variable
		
		
		
	}

}
