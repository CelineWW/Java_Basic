import java.util.Scanner;
public class FuelEfficiency {

	public static void main(String[] args) {
		
		// Program Introduction
		System.out.println("Fuel Efficiency Progarm\n");
		System.out.println("This program calculates the fuel cost per 100 miles and how far the car can go with a full tank of gas,\n"
				+ "taking user's input of tank capacity, fuel efficiency, and fuel price.\n");
		
		// Create Scanner object
		Scanner in = new Scanner(System.in);

		// Prompt user's input for gallons in tank
		System.out.print("How many gallons of fuel of a full tank?\nPlease enter a floating point nubmer: ");
		double gallonsPerTank = in.nextDouble();
		
		// Prompt user's input for miles per gallon
		System.out.print("\nHow many miles can the vechicle run on a gallon of fuel?\nPlease enter a floating point nubmer: ");
		double milesPerGallon = in.nextDouble();
		
		// Prompt user's input for price of gas
		System.out.print("\nHow much is a gallon of fuel?\nPlease enter a floating point nubmer: ");
		double pricePerGallon = in.nextDouble();
		in.close();
		
		// Computer cost per miles and miles per tank
		double costPer100Miles = 0.0;
		double milesPerTank = 0.0;
		
		costPer100Miles = 100 * pricePerGallon / milesPerGallon;
		milesPerTank = milesPerGallon * gallonsPerTank;      
		
		// Display computation result
		System.out.printf("\nGallons Per Tank:      %.2f%n", gallonsPerTank);
		System.out.printf("Miles Per Gallon:      %.2f%n", milesPerGallon);
		System.out.printf("Price Per Gallon:      $%.2f%n", pricePerGallon);
		System.out.printf("Cost Per 100 Mile:     $%.2f%n", costPer100Miles);
		System.out.printf("Miles Per Tank:        %d%n", Math.round(milesPerTank)); // round to nearest integer
        // System.out.printf("Miles Per Tank: %d%n", (int) milesPerTank); // cast with (int) discards the fractional part
		
		// End of the program
		System.out.println("\nThanks for using Fuel Efficiency Calculation System, Goodbye!");		
	}
}
