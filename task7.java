/*
7. Simple Calculator
Problem Statement:
Write a Java program to create a simple calculator that performs basic operations (+, –, ×, ÷) using switch-case. Take two numbers and an operator as input.
*/


package javaproject;

import java.util.Scanner;

public class task7 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter in the format: number operator number");
		int num1= sc.nextInt();
		char op= sc.next().charAt(0);
		int num2= sc.nextInt();
		
		
		
		switch(op)
		{
			case '+':
				int sum= num1+num2;
				System.out.println("Result: "+sum);
				break;
			
			case '-':
				int dif=num1-num2;
				System.out.println("Result: "+dif);
				break;
			
			case '*':
				int mul=num1*num2;
				System.out.println("Result: "+mul);
				break;
				
			case '/':
				int q=num1/num2;
				System.out.println("Result: "+q);
				break;
				
		}
		
		sc.close();
		
	}

}
