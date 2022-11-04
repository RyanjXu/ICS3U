// Write a method "squareofBinomial
// which  sms up to dubles x and y
// and reterns the square of the sum
public class Lesson1_MethodsExercise 
{
	public static void main(String[] args)
	{
		int x=3;
		int y=4;
		System.out.println(square(x,y));
	}
	public static int square(int x, int y)
	{
		int n = (x+y)*(x+y);
		return n;
	}
}
