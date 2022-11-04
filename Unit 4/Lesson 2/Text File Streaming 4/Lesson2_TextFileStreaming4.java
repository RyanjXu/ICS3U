import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

// Stream the file "dates.txt"
// Create the file "dates2.txt"
// Convert the MMDD format from "dates.txt"
// to a DD MMM format in "dates2.txt", without the leading zeroes


// Used three methods to return the answer
// Surprisingly using a switch was inefficient compared to both 12 if conditions and string indexing

public class Lesson2_TextFileStreaming4 {
	public static final String MONTHS = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
	public static String getDateWithSwitch(String s)
	{
		int numDate;
		String date = "";
		int month;
		int day;
		
		numDate = Integer.parseInt(s);
		month = numDate/100;
		day = numDate%100;
		date+= day;
		switch(month)
		{
			case 1:
				date+=" Jan";
				break;
			case 2:
				date+=" Feb";
				break;
			case 3:
				date+=" Mar";
				break;
			case 4:
				date+=" Apr";
				break;
			case 5:
				date+=" May";
				break;
			case 6:
				date+=" Jun";
				break;
			case 7:
				date+=" Jul";
				break;
			case 8:
				date+=" Aug";
				break;
			case 9:
				date+=" Sep";
				break;
			case 10:
				date+=" Oct";
				break;
			case 11:
				date+=" Nov";
				break;
			case 12:
				date+=" Dec";
				break;
			default:
				date+=" UNKNOWN MONTH";
				
		}
		return date;
	}
	public static String getDateWithString(String s)

	{
		int numDate;
		String date = "";
		int month;
		int day;
		
		numDate = Integer.parseInt(s);
		month = numDate/100;
		day = numDate%100;
		date = day + " " + MONTHS.substring((month-1)*3, (month-1)*3+3);
		
		return date;
	}
	public static String getDateWithIf(String s)
	{
		int numDate;
		String date = "";
		int month;
		int day;
		
		numDate = Integer.parseInt(s);
		month = numDate/100;
		day = numDate%100;
		date+= day;
		if(month == 1) return date+= " Jan";
		else if(month == 2) return date+= " Feb";
		else if(month == 3) return date+= " Mar";
		else if(month == 4) return date+= " Apr";
		else if(month == 5) return date+= " May";
		else if(month == 6) return date+= " Jun";
		else if(month == 7) return date+= " Jul";
		else if(month == 8) return date+= " Aug";
		else if(month == 9) return date+= " Sep";
		else if(month == 10) return date+= " Oct";
		else if(month == 11) return date+= " Nov";
		else if(month == 12) return date+= " Dec";
		
		
		else return date;
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner inputFile = new Scanner(new File("dates.txt"));
		PrintWriter outputFile = new PrintWriter("dates2.txt");
		long start = System.nanoTime();
		// this is to measure time
		while(inputFile.hasNextLine())
		{
			outputFile.println(getDateWithSwitch(inputFile.nextLine()));
		}
		
		inputFile.close();
		outputFile.close();
		
		// this is to print the program time
		long end = System.nanoTime();
		long elapsedTime = end - start;
		System.out.println(elapsedTime);
	}
}
