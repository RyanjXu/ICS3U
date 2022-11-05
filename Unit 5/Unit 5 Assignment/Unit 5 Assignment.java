import java.util.*;
import java.io.*;

// Used two separate methods to stream the original document and write to the new document since
// it would be simpler to organize the original data into the new arrays 

public class ChowTechArrayStreaming {
	public static int[] employees = new int[0];
	public static double[] sales = new double[0];
	public static double salesTotal = 0;
	public static double bonusTotal = 0;
	public static int employeeTotal = 0;
	public static File inputFile;
	public static File outputFile;
	// it should be mentioned that we could create 2 arrays with the size 10000 given that all employee IDs are 4 digit
	// numbers and there are only 10000 possible 4 digit numbers
	// thus avoiding the need to extend the arrays every time a new employee ID is read
	
	public static void streamDoc() throws FileNotFoundException // streams the document and creates the arrays
	{
		// Local Variables
		Scanner in = new Scanner(inputFile);
		int ID;
		double saleValue;
		int employeePos;
		
		// Method Body
		// We skip two lines in the input file since they don't contains any relevant data
		in.nextLine();
		in.nextLine();
		
		while(in.hasNextLine())
		{
			ID = Integer.parseInt(in.next());
			saleValue = Double.parseDouble(in.nextLine().trim());
			employeePos = employeeExists(employees, ID);
			if(employeePos == -1) // if we receive -1 we know it doesn't exist
			{
				int[] tempEmployees = new int[employees.length+1]; // creates a new array that's length is the employee record's length + 1
				System.arraycopy(employees, 0, tempEmployees, 0, employees.length); // copies existing data from the array to the new temporary array
				tempEmployees[employees.length] = ID; // sets the new empty value at the end of the temporary array to the ID, we use employees.length as the index value due to array indexing being one less than length
				employees = tempEmployees; // sets the public array 'employees' to the temporary array, extending the array 'employees'
				
				//we are about to do the same thing to the sales array
				double[] tempSales = new double[sales.length+1];
				System.arraycopy(sales, 0, tempSales, 0, sales.length); 
				tempSales[sales.length] = saleValue;
				sales = tempSales;
			}
			else // we have received the position of employee
			{
				sales[employeePos]+=saleValue; // adds the sale value of this record to the existing employee's sales record
			}
		}
		
		in.close();
	}
	
	public static void writeToDoc() throws IOException // prints to the new document with the arrays created
	{
		// Local Variables
		PrintWriter out = new PrintWriter(outputFile);
		
		if(employees.length!=sales.length) // troubleshooting method, if the data is stored incorrectly the program will terminate
		{
			System.out.println("# of employees doesn't match sales record! ");
			System.exit(0);
		}
		// Method Body
		// the output file manually prints these two lines since they should be printed manually
		out.printf("%s%15s%15s\n", "Employee IDs", "Sales Total", "Bonus Total");
		out.println("******************************************");
		employeeTotal = employees.length;
		
		for(int i = 0; i<employees.length; i++)
		{
			out.printf("%-12d%15.2f%15.2f\n", employees[i], sales[i], calculateBonus(sales[i]));
			salesTotal+=sales[i];
			bonusTotal+=calculateBonus(sales[i]);
		}
		out.println("******************************************");
		out.printf("Number of Employees: %d\n", employeeTotal);
		out.printf("Sales total: %.2f\n", salesTotal);
		out.printf("Bonus total: %.2f\n", bonusTotal);
		
		out.close();
	}
	
	public static int employeeExists(int[] employeeRecord, int employee) // checks array for the employee ID and returns -1 if he doesn't exist, else returns index position
	{
		for(int i =0; i<employeeRecord.length; i++)
		{
			if(employeeRecord[i]==employee)
			{
				return i;
			}
		}
		return -1;
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
