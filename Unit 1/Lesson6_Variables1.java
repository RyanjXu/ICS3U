
public class Lesson6_Variables1 
{
	public static void main(String[] args)
	{
		//Variables are "memory boxes"
		// you create in the RAM
		// to store data
		
		// Variables allow you to store, modify,
		// and retrieve data from the RAM
		
		// To create a variable, you'd need:
		// 1) the data type (int, double, boolean, etc)
		// 2) the name of the variable
		// 3) The value to store in the variable
		
		//for example I want to store my lucky 
		//number 13 as a variable in the RAM space
		
		
		//the type of variable you use indicates to your RAM where it should be stored
		int luckyNumber = 13;
		System.out.println(luckyNumber);
		int count = 9798;
		System.out.printf("%0,11d\n", count);
		
		// We have primaril 4 ways to modify data value in a variable
		
		//1) direct modification
		// forcefully changing the number
		luckyNumber = 8;
		System.out.println(luckyNumber);
		// lucky number has now been changed to 8
		
		// 2) incremental change
		// usually foudn in for loops
		// increase or decreasing by one
		luckyNumber++;
		System.out.println(luckyNumber);
		luckyNumber--;
		System.out.println(luckyNumber);
		
		// 3) direct increase/decrease
		luckyNumber += 12;
		// this will increase luckyNumber by 12
		luckyNumber -=7;
		// this will decrease luckyNumber by 7
		//you can also divide and multiple variables with
		// *= and /=
		
		//4)
		// e.g. I want to change hte lukcy number by
		// i) multiply by 5
		// ii) increase by 3
		// iii) divide by 2
		luckyNumber = (luckyNumber * 5 + 3);
				
		// Create a string variable called
		//chowChowString and store the value
		// "chow" inside the variable
		String chowChowString = "chow";
		System.out.println(chowChowString);
		System.out.println("chowChowString");
		
		chowChowString = chowChowString + luckyNumber;
		
		// easily confused situation
		int x = 5;
		int y = x;
		//here y is = to 5
		x += 4;
		// x is now equal to 9
		System.out.println(y);
		// y is still = to 5 as y was set to equal to x (5), not constantly check the original value of x
	}
}
