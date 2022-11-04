
public class Lesson2_MethodOverloading2 {
	public static int power(int a, int b)
	{
		// Local Variables
		int c = 1;
		
		// Method Body
		for(int i = b;i>0;i--)
		{
			c*=a;
		}
		return c;
	}
	public static double power(double a, int b)
	{
		// Local Variables
		double c = 1;
		
		// Method Body
		for(int i = b;i>0;i--)
		{
			c*=a;
		}
		return (int) (c*100 + 0.5)/100.0;
	}
	public static void main(String[] adsfjlaks)
	{
		// Run Code
		System.out.println(power(2,0));
		System.out.println(power(1.2,2));
	}
}
