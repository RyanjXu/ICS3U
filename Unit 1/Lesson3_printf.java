
public class Lesson3_printf 
{
	public static void main(String[] args)
	{
		//So far we've seen println and print
		// However there's actually one more
		// that will be used quite often
		// in this course known as 
		// printf
		// the f in printf stands for FORMAT
		// printf is similar to print where it doesn't skip a line
		
		//%s is known as a string holder
		//%s is then replaced by the string afterwards
		// the syntax would be like printf(%s, stringReplacingIt)
		// very useful in games for storing something like a username
		//act's a a variable
		// we won't have to use +'s and different quotation marks to inttegrate a variable
		// instead, printf(gameDialogue%s moreGameDialogue, name)
		
		System.out.println("Hello");
		System.out.printf("123321%s abccba\n", "Hello");
		
		
		System.out.printf("Hello %s, you are %s years old", "Ryan", "15");
		// since we used two stirng holders, we will have to provide two strings
		// if we don't rpovdie enought strings, it will execute until it reaches the line
		// at which point it will trhow an exception at you
		System.out.println("\n123456789012345678901234567890");
		//printf allows you to control the number of tab spacing rather than putting spaces
		
		//%ns where n represents an integer, the integer will be the number of reserved spaces, right aligned
		//%-ns n is the numbered of reserved spaces, left aligned
		//if you are using %s you will probably be using left alignment 
		System.out.printf("%-15s%s", "Name", "Grade");
		
		System.out.println("%s");
		
	}
}
