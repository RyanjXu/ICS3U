// Write a program that asks the user for three lengths

// The program first determines if a triangle can be formed
// using these three lengths i.e A triangle can be formed
// if the sum of the shorter two sides exceed the 3rd side

// If a triangle can be formed, display
// "A triangle can be formed" (original step to display area)

// If a triangle cannot be formed, ask the user to 
// enter another value to replace the longest side
// If the three side can be formed into a triangle,
// proceed with the aforementioned statement (original step to display area)
// However, if the three sides still cannot form a triangle
// display
// "A triangle cannot be formed"

import java.util.Scanner;
public class Lesson5_nestedConditionalStrucutre2 
{
	public static void main(String[] args)
	{
		// Global Variables
		double sideA;
		double sideB;
		double sideC;
		Scanner s = new Scanner(System.in);
		
		// Run Code
		System.out.println("Enter length #1: ");
		sideA = s.nextDouble();
		System.out.println("Enter length #2: ");
		sideB = s.nextDouble();
		System.out.println("Enter length #3: ");
		sideC = s.nextDouble();	
		
		if(sideC + sideB < sideA)
		{
			System.out.println("A triangle cannot be formed please reenter the first length: ");
			sideA = s.nextDouble();
			if (sideC + sideB < sideA)
			{
				System.out.println("A triangle cannot be formed");
			} 
			else 
			{
				System.out.println("A triangle can be formed, the area is: " + Math.sqrt(((sideA + sideB + sideC)/2)*(((sideA + sideB + sideC)/2)-sideA)*(((sideA + sideB + sideC)/2)-sideB)*(((sideA + sideB + sideC)/2)-sideC)));
			}
		}
		else
		{
			if(sideC + sideA < sideB)
			{
				System.out.println("A triangle cannot be formed please reenter the second length: ");
				sideB = s.nextDouble();
				if (sideC + sideA < sideB)
				{
					System.out.println("A triangle cannot be formed");
				} 
				else 
				{
					System.out.println("A triangle can be formed, the area is: " + Math.sqrt(((sideA + sideB + sideC)/2)*(((sideA + sideB + sideC)/2)-sideA)*(((sideA + sideB + sideC)/2)-sideB)*(((sideA + sideB + sideC)/2)-sideC)));
				}
			}
			else
			{
				if(sideB + sideA < sideC)
				{
					System.out.println("A triangle cannot be formed please reenter the third length: ");
					sideC = s.nextDouble();
					if (sideB + sideA < sideC)
					{
						System.out.println("A triangle cannot be formed");
					} 
					else 
					{
						System.out.println("A triangle can be formed, the area is: " + Math.sqrt(((sideA + sideB + sideC)/2)*(((sideA + sideB + sideC)/2)-sideA)*(((sideA + sideB + sideC)/2)-sideB)*(((sideA + sideB + sideC)/2)-sideC)));
					}
				}
				else
				{
					System.out.println("A triangle can be formed, the area is: " + Math.sqrt(((sideA + sideB + sideC)/2)*(((sideA + sideB + sideC)/2)-sideA)*(((sideA + sideB + sideC)/2)-sideB)*(((sideA + sideB + sideC)/2)-sideC)));
				}
			}
		}
		s.close();
	}
}
