
public class Lesson1_BooleanOperators 
{
	public static void main(String[] args)
	{
		//boolean operators are operatores that result in boolean values (true/false)
		// > is left side greater than right side
		// < is right side greater than left side
		// <= is right side greater than or equal to left side
		// >= is left side greater than or equal to right side
		// == is equality between side
		// != is inequality between sides
		System.out.println(3 > 4);
		System.out.println(4 >= 4);
		System.out.println(5 == 4);
		System.out.println(4 != 3);
		System.out.println(5*9/3 <= 4.15*6.29);
	
		
		// THIS IS A TEST QUESTION PREPARE TO STUDY
		// is 11 = 11.0????
		//System.out.println(3+8==4.5+6.5);
		//the above is true because when we compare a double with an integer
		// the integer will convert into a double for comparison
		// hence the 11 on the left side will become 11.0 when compared to the right side
		// same applies for
		System.out.println(3.8==4.001 + 6.999);
		// you can apply == and != to booleans
		
		//System.out.println(true == true);
		System.out.println(true == false);
		System.out.println(true != false);
		
		// they cna also be applies to character
		// characters are denoted with a single quote
		//System.out.println('3' == '3');
		System.out.println(';' != '!');
		System.out.println('&' < '(');
		System.out.println('c' <= 'a');
		System.out.println('N' >= 'I');
		System.out.println('A' == 'a');
		System.out.println('b' < 'c');
		System.out.println('d' < 'e');
		System.out.println('X' < 'j');
		//this is true as the binary representation for X is lower than the binary for lowercase j
		// all punctuation come before letters
		// all uppercase letters come before lowercase letters
		
		System.out.println('a' < 98);
		//true because a is 97 when represented by a binary number
		
		//you CANNOT apply the above boolean operators
		// to strings as strings are NOT a primitive datat type
		// boolean operators can only be applied to primitive data types
		// how would you copare two strings?
		// use .equals to determine if they are the same
		
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		// => and =< are invalid inputs
	}
}
