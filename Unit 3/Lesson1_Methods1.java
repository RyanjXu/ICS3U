
public class Lesson1_Methods1 {
// Writing methods avoid repetitive codes
	
// We can write a method and apply it anywhere we want
	public static void main(String[] args)
	{
		for(int i = 1; i<=5; i++)
		{
			format(i);
		}
	}
	
	public static void format(int n)
	{
		System.out.println("\n============");
		System.out.println("============");
		System.out.println("><><><><><><");
		System.out.println("><><><><><><");
		System.out.printf(" - Part %d - ", n);
	}
}
