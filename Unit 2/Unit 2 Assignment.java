import java.util.Scanner;

public class numberGuessingGame 
{
	public static void main(String[] args)
	{
		// Global Variables
		Scanner sc = new Scanner(System.in);
		int secretNumber = 13;
		int guess;
		
		// Run Code
		for(int i = 0; i<10; i++)
		{
			System.out.print("Guess the secret number? ");
			guess = sc.nextInt();
			
			if(guess == secretNumber) 
			{
				System.out.println("Congratulations! That is the secret number!");
				break;
			}
			else if(guess < 1 || guess > 999)
			{
				System.out.println("Invalid Input! Ensure your number is between 1 and 999!");
				System.out.printf("You have %d guesses left.\n", 10 - i);
				i--;
			}
			else if(guess != secretNumber && i == 9)
			{
				System.out.println("Too bad! Try harder next time!");
				break;
			}
			else if(guess < secretNumber && guess > 0)
			{
				System.out.printf("Choose a larger number! You have %d guesses left.\n", 9 - i);
			}
			else if(guess > secretNumber && guess < 1000)
			{
				System.out.printf("Choose a smaller number! You have %d guesses left.\n", 9 - i);
			}
		}
		sc.close();
	}
}
