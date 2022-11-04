import java.util.Scanner;

public class chowChowFruitCentre 
{
	public static void main(String[] args)
	{
		// Global Variables
		
		Scanner sc = new Scanner(System.in);
		int apples;
		int oranges;
		double lichee;
		double blueberries;
		double priceApples;
		double priceOranges;
		double priceLichee;
		double priceBlueberries;
		double subTotal;
		double hst;
		double netTotal;
		
		//Run Code
		
		System.out.println("How many apples did you purchase? ");
		apples = sc.nextInt();
		System.out.println("How many oranges did you purchase? ");
		oranges = sc.nextInt();
		System.out.println("How many pounds of lychees did you purchase? ");
		lichee = sc.nextDouble();
		System.out.println("How many pounds of blueberries did you purchase? ");
		blueberries = sc.nextDouble();
		
		priceApples = apples * 0.83;
		priceOranges = oranges * 0.75;
		priceLichee = lichee * 2.49;
		priceBlueberries = blueberries * 1.42;
		subTotal = priceApples + priceOranges + priceLichee + priceBlueberries;
		hst = subTotal * 0.13;
		netTotal = subTotal + hst;
		
		header(apples, oranges, lichee, blueberries);
		receipt(priceApples, priceOranges, priceLichee, priceBlueberries, apples, oranges, lichee, blueberries, subTotal, hst, netTotal);
		footer();
		
		sc.close();
	}
	
	static void header(int a, int o, double l, double b)
	{
		for(int i = 0; i < 25; i++) 
		{
			System.out.printf("><");
		}
		System.out.printf("\n%36s\n", "Chow Chow Fruit Centre");
		for(int i = 0; i < 25; i++) 
		{
			System.out.printf("><");
		}
		
		System.out.printf("\n\nNumber of apples purchased:%9s%d", "", a);
		System.out.printf("\nNumber of oranges purchased:%8s%d", "", o);
		System.out.printf("\nAmount of lychees purchased:%8s%s", "", l);
		System.out.printf("\nAmount of blueberries purchased:%4s%s\n\n", "", b);
		
		
	}
	
	static void receipt(double pA, double pO, double pL, double pB, int a, int o, double l, double b, double sT, double t, double nT)
	{
		for(int i = 0; i <21; i++)
		{
			System.out.printf("-");
		}
		System.out.printf("Receipt");
		for(int i = 0; i<22; i++)
		{
			System.out.printf("-");
		}
		System.out.println("\n");
		
		System.out.printf("Description%29s%10s\n\n", "Quantity", "Price");
		System.out.printf("Apples @ $0.83/each%21d%10.2f\n", a, pA);
		System.out.printf("Oranges @ $0.75/each%20d%10.2f\n", o, pO);
		System.out.printf("Lychees @ $2.49/lbs%21.2f%10.2f\n", l, pL);
		System.out.printf("Blueberries @ $1.42/lbs%17.2f%10.2f\n", b, pB);
		System.out.printf("\n%40s%10.2f", "Subtotal", sT);
		System.out.printf("\n%40s%10.2f", "H.S.T. (13%)", t);
		System.out.printf("\n\n%40s%10.2f", "Net Total", nT);
	}
	
	static void footer()
	{
		System.out.println("\n");
		for(int i =0;i<7;i++)
		{
			System.out.printf("-");
		}
		System.out.printf("THANK YOU FOR SHOPPING WITH US TODAY!");
		for(int i = 0;i<6;i++)
		{
			System.out.printf("-");
		}
	}
	
}
