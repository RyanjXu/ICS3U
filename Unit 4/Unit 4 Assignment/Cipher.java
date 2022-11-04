import java.io.*; // imports all "useful" java utils
import java.util.Scanner;
public class Cipher {
	
	// Encryption Key 
	// Private because we don't want other classes accessing the key
	private static String OLD = "AEIJOPRSTVX ";
	private static String NEW = "@=!?*#&$+^%_";
	// boolean to determine whether or not the user is going to encrypt the file
	public static boolean encrypt = true;
	
	public static void main(String[] args) throws IOException
	{
		
		// Global Variables
		Scanner userInput;
		Scanner inputFile;
		PrintWriter outputFile;
		
		// Run Code
		userInput = new Scanner(System.in);
		System.out.println("What is the name of the file you want to encrypt/decrypt: ");
		inputFile = new Scanner(new File(userInput.nextLine() + ".txt"));
		System.out.println("What is the name of the file you want to output to: ");
		outputFile = new PrintWriter(userInput.nextLine() + ".txt");
		System.out.println("If you are encrypting the file please enter 'y' otherwise please enter 'n': ");
		encrypt = userInput.nextLine().equals("y");
		

		while(inputFile.hasNextLine())
		{
			String line = inputFile.nextLine();
			outputFile.println(stringManipulation(encrypt(line.toUpperCase(), encrypt), encrypt));
		}
		inputFile.close();
		outputFile.close();
		userInput.close();
	}
	public static String encrypt(String input, boolean encrypt)
	{ 
		// new string to fill with encrypted chars
		
		// Local Variable
		String returnString = "";
		
		/** 
		 * checks every char in the string to be encrypted
		 * if a char is found in the encryption key, it is replaced
		 * otherwise the char is added to the string 'New'
		 * 
		 * if the boolean 'encrypt' is false
		 * it will do the steps in reverse
		 */
		
		// Method Body
		if(encrypt)
		{
			for(int i  = 0; i<input.length();i++)
			{
				if(OLD.contains(input.substring(i,i+1)))
				{
					returnString+=NEW.charAt(OLD.indexOf(input.charAt(i)));
				}
				else
				{
					returnString+=input.charAt(i);
				}
			}
			return returnString;
		}
		for(int i  = 0; i<input.length();i++)
		{
			if(NEW.contains(input.substring(i,i+1)))
			{
				returnString+=OLD.charAt(NEW.indexOf(input.charAt(i)));
			}
			else
			{
				returnString+=input.charAt(i);
			}
		}
		return returnString;
		
	}

	public static String stringManipulation(String input, boolean encrypt)
	{
		// Local Variables
		int len = input.length();
		int half = (int) Math.ceil(len/2.0);
		String returnString = "";
		
		// Method Body
		// Checks if the line should be encrypted
		if(encrypt)
		{
			// Swaps the first half with the second half
			input = input.substring(half,len) + input.substring(0,half);
			
			// Swaps the first two letters with the last two
			input = input.substring(len-2) + input.substring(2,len-2) + input.substring(0,2);
			
			// Swaps the 2 characters immediately to the left of the string with the 2 characters that follow them
			input = input.substring(0,(half)-2) + input.substring(half,(half)+2) + input.substring((half)-2,half) + input.substring((half)+2);
			
			// Swaps every 2 letters
			if(len%2==1) // If the string is odd it will swap every 2 letters before the last and then attach the last letter as that letter isn't swapped
			{
				for(int i = 0; i<len-1; i+=2)
				{
					returnString+=input.charAt(i+1);
					returnString+=input.charAt(i);
				}
				returnString+=input.charAt(len-1);
			}
			else
			{
				for(int i = 0; i<len; i+=2)
				{
					returnString+=input.charAt(i+1);
					returnString+=input.charAt(i);
				}
			}
			return returnString;
		}
		if(len%2==1)
		{
			for(int i = 0; i<len-1; i+=2)
			{
				returnString+=input.charAt(i+1);
				returnString+=input.charAt(i);
			}
			returnString+=input.charAt(len-1);
		}
		else
		{
			for(int i = 0; i<len; i+=2)
			{
				returnString+=input.charAt(i+1);
				returnString+=input.charAt(i);
			}
		}
		//replaced all instances of the String 'input' with the String 'returnString' as in the original string manipulation
		//the input would be put into the swap every two letters loop after the other manipulations (split in half, swap first and last, etc)
		//now that the extra string manipulation is being done outside of the loop we should use returnString as that represents a stirng taht has already
		// had every two letters returned to their original position
		returnString = returnString.substring(0,(half)-2) + returnString.substring(half,(half)+2) + returnString.substring((half)-2,half) + returnString.substring((half)+2);
		returnString = returnString.substring(len-2) + returnString.substring(2,len-2) + returnString.substring(0,2);
		returnString = returnString.substring(half,len) + returnString.substring(0,half);
		if(len%2==1) returnString = returnString.substring(len-1) + returnString.substring(0,len-1);
		return returnString.toLowerCase();
	}
}
