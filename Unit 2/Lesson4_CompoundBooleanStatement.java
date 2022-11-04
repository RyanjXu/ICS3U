import java.util.Scanner;

public class Lesson4_CompoundBooleanStatement 
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
		else if(mark>=80) // mark is larger than 80
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
