package edu.cs.saintjoe.yohanesl.SimpleDotCom_YJL;

public class NumberConvert {

	public static void main(String[] args) {
		// Let's make a string
		String stringOne = "22";
		String stringTwo = "22";
		// Here is the binary number we will store it in
		int intValue1 = 0;
		int intValue2 = 0;
		intValue1 = Integer.parseInt(stringOne);
		intValue2 = Integer.parseInt(stringTwo);
		
		// Note adding two strings together is called "catenation" 
		System.out.println(intValue1 + intValue2);
		
		// Adding two numbers together is called "addition" :-)
		System.out.println(stringOne + stringTwo);
	}

}


