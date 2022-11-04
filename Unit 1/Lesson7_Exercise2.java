import java.util.Scanner;
public class Lesson7_Exercise2 
{
	public static void main(String[] args)
	{
		// Global Variables
		Scanner sc = new Scanner(System.in);
		int numberOne;
		int numberTwo;
		
		// Run Code
		
		// Capture first integer
		System.out.print("Enter integer #1: ");
		numberOne = sc.nextInt();
		// Capture second integer
		System.out.print("Enter integer #2: ");
		numberTwo = sc.nextInt();
		
		// Displaying 4 arithmetic line
		System.out.printf("%d + %d = %d" , numberOne, numberTwo, numberOne + numberTwo);
		System.out.printf("\n%d - %d = %d" , numberOne, numberTwo, numberOne - numberTwo);
		System.out.printf("\n%d x %d = %d" , numberOne, numberTwo, numberOne * numberTwo);
		System.out.printf("\n%d / %d = %d R%d", numberOne, numberTwo, numberOne / numberTwo, numberOne % numberTwo);
		
		// Closing scanner
		sc.close();
	}
}
