package edu.wit.cs.comp1000;

import  java.util.Scanner;

public class PA1b {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	
 int yards = 0 ;
 int feet = 0 ; 		 
 int inches = 0 ;

	System.out.println("enter number of inches in a whole number");
	inches = input.nextInt();

	int total = (yards * 3*12) + (feet*12) + inches;
	System.out.println(total);

	}

}