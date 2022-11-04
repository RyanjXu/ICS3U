import java.util.Scanner;
public class nestedConditionalStructureExercise 
{
	public static void main(String[] args)
	{
		// Global Variables
		Scanner sc = new Scanner(System.in);
		boolean moves;
		boolean should;
		
		// Run Code
		System.out.println("Does it move? ");
		moves = sc.nextBoolean();
		System.out.println("Should it? ");
		should = sc.nextBoolean();
		
		if(moves==true)
		{
			if(should == true)
			{
				System.out.println("No problem");
			}
			else
			{
				System.out.println("Duct tape");
			}
		}
		else
		{
			if(should == true)
			{
				System.out.println("WD-40");
			}
			else
			{
				System.out.println("No problem");
			}
		}
		sc.close();
	}
}
