import java.util.*;
import java.io.*;

public class ChowTechHashmap {
	public static HashMap<Integer, Double> salesRecord = new HashMap<Integer, Double>(); // we create a map that stores the ID as the key and the sales value as the double
	public static double salesTotal = 0;
	public static double bonusTotal = 0;
	public static int employeeTotal = 0;
	public static File inputFile;
	public static File outputFile;
	public static void streamDoc() throws FileNotFoundException // streams the document and creates the arrays
	{
		// Local Variables
		Scanner in = new Scanner(inputFile);
		int ID;
		double saleValue;
		
		// Method Body
		// We skip two lines in the input file since they don't contains any relevant data
		in.nextLine();
		in.nextLine();
		while(in.hasNextLine())
		{
			ID = Integer.parseInt(in.next());
			saleValue = Double.parseDouble(in.nextLine().trim());
			if(salesRecord.containsKey(ID))
			{
				salesTotal+=saleValue;
				salesRecord.put(ID, salesRecord.get(ID)+saleValue);
			}
			else
			{
				salesTotal+=saleValue;
				salesRecord.put(ID, saleValue);
			}
		}
		in.close();
	}
	public static void writeToDoc() throws IOException // prints to the new document with the arrays created
	{
		// Local Variables
		PrintWriter out = new PrintWriter(outputFile);
		
		// Method Body
		// the output file manually prints these two lines since they should be printed manually
		out.printf("%s%15s%15s\n", "Employee IDs", "Sales Total", "Bonus Total");
		out.println("******************************************");
		employeeTotal = salesRecord.size();
		
		// the searching method in a for-each loop causes the result to be printed out of the original order
		for(int i : salesRecord.keySet()) // checks for int i in a set of keys within the HashMap (.keySet() creates a set of all keys within the map)
		{
			bonusTotal+=calculateBonus(salesRecord.get(i));
			out.printf("%-12d%15.2f%15.2f\n", i, salesRecord.get(i), calculateBonus(salesRecord.get(i)));
		}
		
		out.println("******************************************");
		out.printf("Number of Employees: %d\n", employeeTotal);
		out.printf("Sales total: %.2f\n", salesTotal);
		out.printf("Bonus total: %.2f\n", bonusTotal);
		
		out.close();
	}	
	public static double calculateBonus(double salesvalue) // calculates the bonus based on employee's total sales
	{
		return salesvalue*0.05;
	}
	public static void main(String[] args) throws IOException
	{
		// Global Variables
		Scanner userInput;
		String documentYear;
		
		// Run Code
		userInput = new Scanner(System.in);
		System.out.println("What year is the document from? ");
		documentYear = String.valueOf(userInput.nextInt());
		inputFile = new File(documentYear + "_sales_summary.txt");
		outputFile = new File(documentYear + "_final_summary.txt");
		
		streamDoc();
		writeToDoc();
		
		userInput.close();
	}
}
