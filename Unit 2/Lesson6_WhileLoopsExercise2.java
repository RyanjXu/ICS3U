// Write a program where the user is asked for the magic phrase
// The program will not terminate until the user enters
// "please" or "thank you"
// In which the program will respond with "You know your manners!"

// Hint: You would need to use compound boolean statements (&& or ||)
//       You need to use .equals() to compare Strings
import java.util.Scanner;
public class Lesson6_WhileLoopsExercise2 
{
	public static void main(String[] seeeeshshsheses)
	{
		// Global variables
		Scanner s = new Scanner(System.in);
		String guess;
		boolean manners = false;
		// Run code
		while(!manners)
		{
			System.out.println("Please enter the magic phrase: ");
			guess = s.nextLine();
			if(guess.equals("please") || guess.equals("thank you"))
			{
				System.out.println("You know your manners!");
				manners = true;
			}
		}
		s.close();
	}
}
