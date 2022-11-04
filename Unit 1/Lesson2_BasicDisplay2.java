public class Lesson2_BasicDisplay2 
{	
	public static void main(String[] args)
	{
		
		System.out.println("abc");
		System.out.printf("abc");
		
		// \n adds a new line, \t adds a tab to the print
		// \n <- manual line skip
		// \t <- manual tab skip
		// \n and \t can be used inside of a string such as this
		System.out.println("\nHello\nWelcome to\nICS3U\n!");
		
		String s = "\nhi";
		System.out.println(s);
		
		//tab spacing will put your cursor at the next position that is a multiple of 8
		System.out.println("123456789012345678901234567890");
		System.out.println("\tHello");
		System.out.println("Hello\tHello");
		//the first position will always be index 0
		
		//What do i need to do to display :
		//" <- double quotation mark?
		// in order to display a quotation you must type \"
		System.out.println("\"CS is fun\"");
		
		//How do i display a backslash?
		// \\ will display a single backslash
		
		System.out.println("\\//\t\\\n\tHI\"\"");
		System.out.println("Name: \t\tGrade");
		System.out.println("Name\t\tGrade");
		
		}
}
