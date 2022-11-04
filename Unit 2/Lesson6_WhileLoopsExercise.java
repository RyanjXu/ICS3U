// The program asks the user to enter a magic number
// between 1 and 9 inclusive

// if the user enters the magic number, 
// the program will terminate with the prompt 
// "that is the magic number"
// otherwise the program will ask the user 
// for the magic number until the user gets it correct
import java.util.Scanner;
public class Lesson6_WhileLoopsExercise 
{
	public static void main(String[] penis)
	{
		// Global Variables
		boolean found = false;
		int number = 13;
		int guess = 0;
		Scanner s = new Scanner(System.in);
		
		// Run Code
		while (!found)
		{
			System.out.println("Please enter your guess: ");
			guess = s.nextInt();
			if(guess == number)
			{
				System.out.println("That is the magic number");
				found = true;
			}
			
		}
		s.close();
	}
}
