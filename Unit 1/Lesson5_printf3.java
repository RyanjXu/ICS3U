
public class Lesson5_printf3 
{
	public static void main(String[] args)
	{
		//how do we pritn a % in printf?
		//backslash doens't work for \%
		//%% displays a singular % sign
		//System.out.printf("%");
		// ^ incorrect
		System.out.printf("%%");
		// ^ correct
		
		System.out.printf("%n");
		//this skips a line, only line skipping works like this, none of the others work:
		// %t, %', %\ don't work
		//% is not a \ replacement
		// most still stick to \n
		// %n dones't work in println
		
		System.out.printf("%%%n%%");
		System.out.println("");
		//string holder will print it without issue
		// no formatting in arguments in printf
		// backslash formatting remains normal
		// i.e. \\ in a string holder still only prints on \
		
		System.out.printf("%s", "%");
		
		
		//in test class exercise
		System.out.printf("%-6s%%%n\\%s%10s", "%s%%", "%%%%%%", "\\abc\\");
		// my answer
		// %s%%  %
		// \%%%%%%   \\abc\\
		
		//incorrect as I got the double backslash incorrect
		
		//correct answer
		// %s%%  %
		// \%%%%%%    \abc\ 
		
		
	}
}
