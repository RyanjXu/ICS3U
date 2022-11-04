public class Lesson1_BasicDisplay1 
{
	// codeHS uses an older version of Java
	// which uses the signature "public void run()"
	// In the modern Java, this will NOT work
	// instead, you have to use the following signature
	// public static void main(String[] args)
	
	public static void main(String[] args) 
	{
		System.out.println(4);
		System.out.println("4");
		System.out.println(4 + 5);
		System.out.println("4" + "5");
		
		System.out.println(4.5-3);
		System.out.println(17.5/7);
		
		System.out.println();
		
		//operations that cannot be mixed
		//System.out.println("abc" - 5);
		//Strings/chars do not mix with ints and doubles
		//Samne goes for booleans
		
		//if we mix a string with a int with an addition sign
		//it will print the sstring followed by the int/double
		
		
		//System.out.println(true + 5);
		//doesn't work for booleans\
		
		//multiplication of strings only works in python it doesn't duplicate the string in Java
		
		System.out.println(4*9+5+"Chow"+4*9+5);
	}

}
