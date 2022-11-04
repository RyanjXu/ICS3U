
public class Lesson7_ForLoops1 {
	public static void main(String[] args)
	{
		for(int i = 0; i<4; i++)
		{
			System.out.println("Hello");
		}
		
		//once the second part (the condition) of the for-loop is not met, then the for loop will terminate
		// 	for (var; condition; increment) 
		// 	{
		// 		action;
		// 	}
		// the local variable (whatever is declared within the for loop) 
		// will be cleared from the ram
		
		//there are 3 parts inside of a for loop
		// 1) declaring the variable
		// 2) condition
		// 3) adjustment to variable
		
		//it is possible to have an infinite for loop
		// for (int i = 0; i <=10; i--)
		// {
		// actions ( will repeat infinitely as i will never be greater than 10);
		// }
		// i += 0 would also work
	}
}
