/*
6. Array Element Search
Problem Statement:
Write a Java program that takes an array of integers and a key from the user, and searches for that key in the array using a loop. If found, display its index.
*/


package javaproject;

import java.util.Scanner;

public class task6 {
	public static int search(int arr[] , int key , int n)
	{
		for(int i=0;i<n;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Found!");
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements: ");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the key: ");
		int key= sc.nextInt();
		
		int ind= search(arr , key , n );
		 
		if(ind==-1)
		{
			System.out.println("Not found!");
		}
		else
		{
			System.out.println("Element "+key+" found at index: "+ind);
		}
		sc.close();
		
	}

}
