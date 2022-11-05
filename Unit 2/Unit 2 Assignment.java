import java.util.Scanner;

public class numberGuessingGame 
{
	private static final int secretNumber = 13;
	public static void main(String[] args)
	{
		// Global Variables
		Scanner sc = new Scanner(System.in);
		
		// Run Code
		for(int i = 0; i<10; i++)
		{
			System.out.print("Guess the secret number? ");
			int guess = sc.nextInt();
			
			if(guess == secretNumber) // Case 1: Correct Guess
			{
				System.out.println("Congratulations! That is the secret number!");
				break;
			}
			else if(guess < 1 || guess > 999) // Case 2: Invalid input, guess is returned
			{
				System.out.println("Invalid Input! Ensure your number is between 1 and 999!");
				System.out.printf("You have %d guesses left.\n", 10 - i);
				i--;
			}
			else if(guess != secretNumber && i == 9) // Case 3: Final guess incorrect, game over
			{
				System.out.println("Too bad! Try harder next time!");
				break;
			}
			else if(guess < secretNumber && guess > 0) // Case 4: Smaller number chosen
			{
				System.out.printf("Choose a larger number! You have %d guesses left.\n", 9 - i);
			}
			else if(guess > secretNumber && guess < 1000) // Case 5: Larger number chosen
			{
				System.out.printf("Choose a smaller number! You have %d guesses left.\n", 9 - i);
			}
		}
		sc.close();
	}
}
