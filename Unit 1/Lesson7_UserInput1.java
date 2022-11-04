// in order to ask for user input,
// You need to import that Scanner functionality

import java.util.Scanner;


public class Lesson7_UserInput1 {
	public static void main(String[] args)
	{
		//importing scanner only allows you to access the functionality
		//you have yet to create it in your program
		
		//Global Variables
		
		Scanner sc = new Scanner(System.in); // System.in <<=> Keyboard
		// all variables must be declared at the start of the code under Global Variables
		int age;
		String name;
		
		
		// Run Code
		
		//all running code should be under here
		// Prompt #1
		System.out.println("What is your name? ");
		name = sc.nextLine();
		System.out.printf("Hi %s!", name);
		
		//how do I ask for age?
		System.out.println("\nHow old are you? ");
		age = sc.nextInt();
		System.out.printf("Hi %s! You are %d years old", name, age);
		sc.close();
		
		// Prompt #2
	}
}
