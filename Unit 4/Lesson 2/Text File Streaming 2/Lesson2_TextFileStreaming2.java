// Stream the file marks.txt
// and display the average
// of all marks
// in a new text file with the average at the end


import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Lesson2_TextFileStreaming2 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		//Global variables
		Scanner s = new Scanner(System.in);
		Scanner inputFile = new Scanner(new File("marks.txt"));
		PrintWriter outputFile = new PrintWriter("marksnew.txt");
		
		double entry;
		double accumulator = 0;
		int num = 0;
		
		// Run Code
		while(inputFile.hasNextLine())
		{
			entry = inputFile.nextDouble();
			outputFile.println(entry);
			accumulator += entry;
			num++;
		}
		
		outputFile.printf("The average is: %.2f", accumulator/num);

		System.out.println("done");
		s.close();
		inputFile.close();
		outputFile.close();
	}

}
