/*9. Student Information System
Problem Statement:
 Create a Java class called Student that uses encapsulation to protect its fields: name, rollNumber, and grade.
The fields should be private and accessed using public getter and setter methods.

In the main method, create an object of Student, set values using setters, and display them using getters.
*/


package javaproject;

import java.util.Scanner;

class Student
{
	private int rollno;
	private String name;
	private char grade;
	public
		void set_name(String name)
		{
			this.name=name;
		}
		String get_name()
		{
			return name;
		}
		void set_rollno(int rollno)
		{
			this.rollno=rollno;
		}
		int get_rollno()
		{
			return rollno;
		}
		void set_grade(char grade)
		{
			this.grade=grade;
		}
		char get_grade()
		{
			return grade;
		}
}
public class task9 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		Student s1 = new Student();
		
		System.out.print("Enter name: ");
		String n = sc.nextLine();
		s1.set_name(n);
		
		System.out.print("Enter rollno: ");
		int roll = sc.nextInt();
		s1.set_rollno(roll);
		
		System.out.print("Enter grade: ");
		char g = sc.next().charAt(0);
		s1.set_grade(g);
		
		System.out.println("Name: "+s1.get_name());
		System.out.println("Rollno: "+s1.get_rollno());
		System.out.println("Grade: "+s1.get_grade());
		sc.close();
		
	}

}
