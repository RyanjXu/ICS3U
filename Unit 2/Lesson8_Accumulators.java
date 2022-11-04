
public class Lesson8_Accumulators 
{
	public static void main(String[] args)
	{
		//an accumulator is a variable that keeps track of an ever increasing value
		// an "accumulating" variable
		// common examples, high scores in games, coins, xp
		
		// Question 2)
		// Evaluate the following: 57 + 70 + 83 + ... + 17282
		// how many terms must be added
		int accumulator = 0;
		
		// Run Code
		for(int i = 57; i <=17282; i+=13)
		{
			accumulator+=i;
		}
		System.out.println(accumulator);
		
		// Question 3)
		// evaluate the following: 32 + 12 - 8 - 28 - ... - 7328
		
		// Global Variable
		int accumulator1 = 0;
		int accumulator2 = 32;
		
		// Run Code
		while(accumulator2 >=-7328)
		{
			accumulator1 += accumulator2;
			accumulator2 -= 20;
		}
		System.out.println(accumulator1);
		
		//Question 3)
		//Evaluate the following -1 + 2 - 4 + 8 ... -16384
		// using a for loop and while loop
		//GLobal variables
		int accumulator3 = 0;
		//RUn code
		for(int num = -1; num!=32768; num*=-2)
		{
			accumulator3 += num;
		}
		System.out.println(accumulator3);
	}
	static void q1()
	{
		
		//suppose there's a game where you 
		// 4 points on stage 1
		// 12 points on stage 2
		// 20 points on stage 3
		// 28 points oon stage 4
		// ... so on and so forth ...
		// How many points would you have by the time you've completeed 329?
		
		//GLobal variables
		int points = 4;
		int stage = 1;
		while(stage!=329)
		{
			points += 8;
			stage++;
		}
		System.out.println(points);
	}
}
