
public class Lesson1_StringMethods {
	public static void main(String[] args)
	{
		//Global Variabels
		String str = "Mr. Chow's Comp Sci Class";
		
		// String methods
		// The following are the only acceptable methods
		// in which you can use for BOTH you codingBat
		// assignemnt as well as any future assessments
		
		// .equals(String)
		// This returns true if the original string
		// matches the one inside the brackets
		System.out.println(str.equals("ABC"));
		System.out.println(str.equals(str));
		
		// .length()
		// This returns the number of characters in the original String
		System.out.println(str.length());
		
		// .charAt(#)
		// This returns the character at
		// the position indicated inside the brackets
		System.out.println(str.charAt(0));
		
		// .substring(#1, #2)
		// substring <- A string containted within another String
		// This returns the substring from positioin $1
		// to position #2
		System.out.println(str.substring(0,str.length()));
		
		// .substring(#)
		// this reutns the substring from the position indicated inside the brackets
		// to the end of the string
		System.out.println(str.substring(20));
		
		// .toUpperCase()
		// returns the string with all characters
		// capitalized
		System.out.println(str.toUpperCase());
		
		// .toLowerCase()
		// returns the string with all characters
		// in lower case
		System.out.println(str.toLowerCase());
		
		// .indexOf(String) or .indexOf(char)
		// this returns the position of the first occurrance of the string/character
		// indicated inside the brackets
		// -1 will be returned if the string/char within the brackets cannot be found
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("Comp"));
		
	}
}
