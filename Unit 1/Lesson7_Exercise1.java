import java.util.Scanner;
public class Lesson7_Exercise1 
{
	public static void main(String[] args)
	{
		//Global Variables
		Scanner sc = new Scanner(System.in);
		String flavour;
		int scoops;
		
		//Run Code
		System.out.println("What flavour of ice cream do you want? ");
		flavour = sc.nextLine();
		System.out.printf("How many scoops of %s do you want? \n", flavour);
		scoops = sc.nextInt();
		System.out.printf("%d scoops of %s flavoured ice-cream coming right up!", scoops, flavour);
		sc.close();
	}
}
