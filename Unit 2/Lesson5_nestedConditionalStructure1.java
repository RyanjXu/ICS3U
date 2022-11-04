import java.util.Scanner;
public class Lesson5_nestedConditionalStructure1 
{
	public static void main(String[] args)
	{
		//Write the follow program using boolean statements
		// the following is how your mobile service provide bills you:
		
		//if you use less than nor equal to 1000 call mins and 
		// less than or equal to 2GB of data it will cost $30
		
		//if you use less than or equal to 1000 call mins and greater than 2gb of data you'll be charged $40
		
		//if you use more than 1000 call mins
		// and less than or equal to 2GB of data
		//you'll be charged $50
		
		//if you use more than 1000 call mins and greater than 2gb of data
		//you'll be charged $100
		
		// Global Variables
		Scanner s = new Scanner(System.in);
		double mins;
		double data;
		
		// Run code
		System.out.println("How many minutes of call time did you use? ");
		mins = s.nextDouble();
		System.out.println("How much data(GB) did you use? ");
		data = s.nextDouble();
		if (mins <= 1000)
		{
			if (data <= 2)
			{
				System.out.println("You'll be charged $30");
			}
			else
			{
				System.out.println("You'll be charged $40");
			}
		}
		else if (data <= 2)
		{
			System.out.println("You'll be chargeed $50");
		}
		else
		{
			System.out.println("You'll be charged $100");
		}
		s.close();
	}
}
