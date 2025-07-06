/*
 8. Multiplication Table
Problem Statement:
 Write a Java program to print the multiplication table of a number entered by the user. For example, if user inputs 5, output should be 5×1 to 5×10.
*/


package javaproject;

import java.util.Scanner;

public class task8 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("The multiplcation table is: ");
		for(int i=1;i<=10;i++)
		{
			int mul=num*i;
			System.out.println(num + " * " + i + " = " + mul);
		}
		sc.close();
	}

}
