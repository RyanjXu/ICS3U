public class Lesson4_printf2 
{
	public static void main(String[] args)
	{

		String name = "Ryan";
		int studentNumber = 123456789;
		double grade = 99.99;
		System.out.printf("%-15s%14s%5s%-6s\n", "Name", "Student Number", "", "Mark");
		System.out.printf("%-15s%14d%5s%-6.2f\n", "Gabriel", 123321231, "", 92.83);
		System.out.printf("%-15s%14d%5s%-6.2f\n", "Zachary", 213415777, "", 89.17);
		System.out.printf("%-15s%14d%5s%-6.2f\n", name, studentNumber, "", grade);
		System.out.printf("%+,3.3f", 123454321.67890);
		//to create an empty column ("%5s", ""), by putting an empty string in and then reserving spaces, you create an empty column the size of your reserved spaces
		
		
		//REMEMBER THAT PRINTF DOESN'T SKIP LINES
		//%s <- string holder
		//if you have one string holders and multiple words to fill it, it will pick the first word
		//opposite is not true for having multiple string holders
		// having multiple string holders will cause a crash in the code
		System.out.printf("%s\n", "Ryan", "Rian", "Xu");
		
		//other holders
		
		//%d <- integer holder, not %i
		//all rules applying to %s will also apply to %d
		
		System.out.printf("%d\n",4312);
		//all character skipping at alignment rules still apply
		
		
		// comma separator
		//if a , is put between the % and the d, the integer will be comma separated into multiples of a thousand
		
		System.out.printf("%,d\n", 290389502);
		
		System.out.printf("%+d\n", 123456789);
		// an addition sign will add an addition to the start
		System.out.printf("%+d\n", -123456);
		//a negative will replace it
		//comma separator and + will work in the same holder
		//space reserving must be placed right before the type of holder
		//i.e., System.out.printf("%+,20d", 12355938283);
		
		System.out.printf("%20d\n", 123456789);
		
		//leading zeroes, if you add a zero before your space reserve, it will fill that space with leading zeroes
		
		System.out.printf("%020d\n", 2134);
		
		//left alignment and leading zeroes do not work you must have right alignment if you use zeros
		
		// %f <- double (float) holder
		// all rules from %s and %d carry over to %f
		// Remember that with doubles, you can include decimals
		// useful float holder
		// %f rounds to nearest 6 decimals
		// JAVA ONLY MAINTAINS 6 DECIMAL PLACES
		
		//leading zeros and formatting rules still applied
		
		//the biggest difference between %f and %d is that you can control the number of
		//decimal spaces being displayed
		// .n <- displays up to n decimal places
		// .n cannot be placed anywhere, .n must be placed AFTER the reserved spaces
		// i.e. ("%20.3f")
		// not ("%.320f")
		System.out.printf("%20.3f", 12345.1234);
		
		//putting everything together, reserved spaces must follow all formatting, decimal rounding must follow reserved spaces
		
		
	}

}
