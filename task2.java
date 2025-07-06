/*
 2. Sum of Two Numbers
Problem Statement:
 Write a Java program that accepts two integers from the user and displays their sum.
*/


package javaproject;

import java.util.Scanner;

public class task2 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1= sc.nextInt();
		System.out.print("Enter second number: ");
		int num2= sc.nextInt();
		int sum=num1+num2;
		System.out.print("Sum is: "+sum);
		
		sc.close();
		
		
	}

}
