/*
3. Check Even or Odd
Problem Statement:
 Write a Java program to check whether a given number is even or odd. Accept a number as input and print whether it's even or odd.
*/


package javaproject;

import java.util.Scanner;

public class task3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num= sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even");
		}
		
		else
		{
			System.out.println("Odd");
		}
		
		sc.close();
	}

}
