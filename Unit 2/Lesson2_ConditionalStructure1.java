// if/else structure
// if/else structure is a type of conditional structure
// where actions are performed based on an
// underlying conditional value
import java.util.Scanner;
public class Lesson2_ConditionalStructure1 
{
	public static void main(String[] args)
	{
		// Global Variables
		Scanner sc = new Scanner(System.in);
		double mark;
		
		// Run Code
		System.out.print("What mark did you get on your test: ");
		mark = sc.nextDouble();
		
		
		// if/else structure
		// if(condition)
		// {
		// 		actions that will take place
		// }
		// else
		// {
		// 		actions that will take place if the condition is not met
		// }
		
		// NO SEMI COLON AT THE BACK OF IF OR ELSE STATEMENTS
		
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
