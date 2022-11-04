// In this lesson, you are asked to stream "ics3unamelist.txt"
// and output into "ics3unamelist.txt" where the first names
// and last names are swapped around

// To begin, write a method call swap
// The method takes a SINGLE String that contains two words
// and returns the same String but with the position of the two words swapped
// without the comma in the middle

// Apply the method swap into the text file streaming

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Lesson2_TextFileStreaming3 {

	public static String nameSwap(String s)
	{
		String name = "";
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) == ',')
			{
				name = s.substring(i+2, s.length()) +", "+ s.substring(0,i);
			}
		}
		
		return name;
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner inputFile = new Scanner(new File("ics3unamelist.txt"));
		PrintWriter outputFile = new PrintWriter("ics3uNameListEdited.txt");
		
		while(inputFile.hasNextLine())
		{
			outputFile.println(nameSwap(inputFile.nextLine()));
		}
		outputFile.close();
		inputFile.close();
	}

}
