// Assignment:
// ask user for an integer input
// print out whether the number is odd or even

import java.util.Scanner;
public class Lesson2_ConditionalStructure1_Question 
{
	public static void main(String[] args)
	{
		// Global Variables
		Scanner sc = new Scanner(System.in);
		int integer;
		
		// Run Code
		System.out.print("Please enter your integer: ");
		integer = sc.nextInt();
		if(integer%2 == 0)
		{
			System.out.printf("%d is an even number", integer);
		}
		else
		{
			System.out.printf("%d is an odd number", integer);
		}
		
		sc.close();
	}
}
