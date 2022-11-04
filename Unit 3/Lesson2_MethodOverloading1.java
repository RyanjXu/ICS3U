// Java allows multiple methods that use the same method name as long as the parameters are different

// Write a method max, which takes two integer parameters x and y
// the method returns the greater of the two numbers
public class Lesson2_MethodOverloading1 {
	public static void main(String[] args)
	{
		System.out.println(max(4, 2));
		System.out.println(max("Hi", "Hello"));
	}
	
	public static int max(int x, int y)
	{
		if(x>y)
		{
			return x;
		}
		return y;
	}
	
	public static String max(String x, String y)
	{
		if(x.length()>y.length())
		{
			return x;
		}
		return y;
	}
	
	// this is method overloading
	// both double and ints can be taken in like 8
	// the computer won't know which one to use automatically
	// it will pick the best option for execution
	// i.e.
	// if we put in max(4.2,2)
	// it will pick the max with double as a double was provided
	public static double max(double x, double y)
	{
		if(x>y)
		{
			return x;
		}
		return y;
	}
	
	//in this case since the parameters are different the computer will automatically choose which method to use
	public static int max(int x, int y, int z)
	{
		return max(max(x,y),z);
		//Genius use of the previous comparison of the 2 numbers to get this in a oneliner
		
	}
	public static int max(int a, int b, int c, int d)
	{
		return max(max(a,b,c),d);
		//Genius use of the previous comparison of the 3 numbers to get this in a oneliner
		// and so on...
		
	}
}
