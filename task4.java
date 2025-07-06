/*
 4. Factorial of a Number
Problem Statement:
 Write a Java program to calculate the factorial of a given positive integer. Factorial of n is the product of all integers from 1 to n.
*/


package javaproject;

import java.util.Scanner;

public class task4 {
	public static void main(String args[])
	{
		int fact=1;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		for(int i=num ; i>1; i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+num+" is: "+fact);
		
		sc.close();
		
	}

}
