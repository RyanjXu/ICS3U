import java.util.Scanner;
public class Lesson8_UserInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//It is generally not accepted to have only 1 scanner to capture
		// multiple different data types
		// Ideally you want to have one dedicated scanner for each data type
		
		// we are going to demonstrate the issue with running a single scanner
		
		// Global Variables 
		Scanner s = new Scanner(System.in);
		
		// Run Code
		
		s.close();
	}

}
