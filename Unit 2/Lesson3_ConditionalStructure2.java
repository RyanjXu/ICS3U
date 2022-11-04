import java.util.Scanner;

// if/else if/else strucutre
// if/else if/else structure is a type of conditional strucutre
// where multipe conditions are checked before reaching
// the else case

// APplying the same scenario
/// if user enters a number great than or equal to 80,
// but less than or equal to 100 display "you can go watch tv"
// if the user enters a number less tan 80,
// but greater or equal to 0
// display "go study for your next test!'
// if the user enters something invalid
// (>100 or <0)
// display "dont try to fool me"

public class Lesson3_ConditionalStructure2 
{
	public static void main(String[] args)
	{
		// Global Variables
		Scanner sc = new Scanner(System.in);
		double mark;
				
		// Run Code
		System.out.print("What mark did you get on your test: ");
		mark = sc.nextDouble();
		if(mark > 100 || mark < 0)
		{
			System.out.println("Dont try to fool me!");
		}
		if(mark>=80) // mark is larger than 80
		{
			System.out.println("Go watch tv");
		}
		else // mark is lesser than 80
		{
			System.out.println("No TV for you");
		}
		
		sc.close();
	}
}
