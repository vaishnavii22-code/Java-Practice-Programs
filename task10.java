/* 
 10. Bank Account Management
Problem Statement:
 Create a class BankAccount that encapsulates a private field balance.
Add public methods: deposit(), withdraw(), and getBalance().
Ensure balance cannot go negative.
In the main method, create a BankAccount object and perform deposit and withdrawal operations, printing balance after each step.

 */

package javaproject;

import java.util.Scanner;



class BankAccount
{
	private int balance;
	
	public
		int deposit(int amt)
		{
			balance=balance+amt;
			return balance;
		}
		int withdraw(int amt)
		{
			balance=balance-amt;
			if(balance<0)
			{
				System.out.println("Insufficient balance....cannot withdraw");
				balance+=amt;
				return balance;
			}
			else if(balance==0)
			{
				System.out.println("Balance is zero");
				return balance;
			}
			else
			{
				return balance;
			}
			
		}
		void getBalance()
		{
			System.out.print("The balance is: "+balance);
			
		}
}
public class task10 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount();
		
		System.out.print("Enter the amount to be deposited: ");
		int amt_d = sc.nextInt();
		account.deposit(amt_d);
		account.getBalance();
		
		System.out.print("Enter the amount to withdraw: ");
		int amt_w = sc.nextInt();
		account.withdraw(amt_w);
		account.getBalance();
		
		sc.close();
		
	}

}