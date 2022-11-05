import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EfficientWithSorting {
	/**Same idea as the original efficient method but with sorting, we sort by recording all the IDs
	 * in the order they come in the int array "employeeOrder", we then check each of these and print in that order
	 */
	public static boolean[] employees = new boolean[10000];
	public static double[] sales = new double[10000];
	public static int[] employeeOrder = new int[0];
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
			if(employeeExists(employees, ID))
			{
				sales[ID]+=saleValue;
			}
			else // we have received the position of employee
			{
				int[] tempEmployees = new int[employeeOrder.length+1];
				System.arraycopy(employeeOrder, 0, tempEmployees, 0, employeeOrder.length);
				tempEmployees[employeeOrder.length] = ID;
				employeeOrder = tempEmployees;
				employees[ID]=true;
				sales[ID]+=saleValue;
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
		
		employeeTotal = employeeOrder.length;
		for(int i : employeeOrder)
		{
			if(employees[i])
			{
				salesTotal+=sales[i];
				bonusTotal+=calculateBonus(sales[i]);
				out.printf("%-12d%15.2f%15.2f\n", i, sales[i], calculateBonus(sales[i]));
			}	
		}
		out.println("******************************************");
		out.printf("Number of Employees: %d\n", employeeTotal);
		out.printf("Sales total: %.2f\n", salesTotal);
		out.printf("Bonus total: %.2f\n", bonusTotal);
		
		out.close();
	}
	public static boolean employeeExists(boolean[] employeeRecord, int employee) // checks array for the employee ID and returns -1 if he doesn't exist, else returns index position
	{
		if(employeeRecord[employee])
		{
			return true;
		}
		return false;
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
