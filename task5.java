/*
5. Palindrome Checker
Problem Statement:
 Write a Java program to check whether a given string is a palindrome. A string is a palindrome if it reads the same backward as forward (e.g., "madam", "121").
*/


package javaproject;

import java.util.Scanner;

public class task5 {
	public static boolean isPalindrome(String str)
	{
		int left =0;
		int right= str.length()-1;
		
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}
		}
		
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter to check palindrome: ");
		String str= sc.nextLine();
		
		boolean check=isPalindrome(str);
		if(check==false)
		{
			System.out.println("Not a palindrome!");
		}
		else
		{
			System.out.println("Is a Palindrome!");
		}
		sc.close();
		
	}
	

}
