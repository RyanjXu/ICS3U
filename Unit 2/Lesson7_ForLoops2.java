// Write a program using for loop to display the first 100 terms in the following sequence as shown below:
// Term #1: 3267
// Term #2: 3199
// Term #3: 3131
// ...
// Term #100: _____

// Question #2:
// Given the sequence -27, -19, -11, 
// Determine which term number returns the value 79005

//Question #3:
// Use a for loop to generate the first 10 terms of the sequence
// -4
// 12
// -36

// Question #4: Use a for loop to determine which term contains the number 49
// -14, -11, -8, ...
public class Lesson7_ForLoops2 
{
	public static void main(String[] args)
	{
		for (int i = 1, term = -14; term<=49; i++, term +=3)
		{
			System.out.printf("Term #%d: %d\n", i, term);
		}
	}
	
	static void q1()
	{
		for (int i = 1, term = 3267; i<=100; i++)
		{
			System.out.printf("Term #%d: %d\n", i, term);
			term -=68;
		}
		
		// two ints can be called within the for loop with the syntax
		//                                      v SAME COMMA BEING USED
		// for(int a = 100, b = 100; i<=100; i++, term-= 68)
		//                ^ COMMA SUPER IMPORTANT IN BETWEEN TWO OF SAME ACTIONS
	}
	static void q2()
	{
		for (int i = 1, term = -27; term <= 79005; i++, term += 8)
		{
			System.out.printf("Term #%d: %d\n", i, term);
		}
	}
	static void q3()
	{
		for (int i = 1, term = 4; i<=10; i++, term *=-3)
		{
			System.out.printf("Term #%d: %d\n", i, term);
		}
	}
}
