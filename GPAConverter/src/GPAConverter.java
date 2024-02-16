// Import Java Standard Libraries
import java.util.Scanner;
import static java.lang.System.out;

public class GPAConverter {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner in = new Scanner(System.in);
		
		// Prompt user input 
		out.println("GPA Converter Program");
		out.println("This Program convert student's grades in points to letter grades.\n");
		out.print("Please enter student's grade in points: ");
		
		// Convert points grade to letter grade
		double point_grade = 0;
		String letter_grade = "";
		if (in.hasNextDouble()) {
			point_grade = in.nextDouble();
		
			if (point_grade > 100 || point_grade < 0) { // (∞,0) U (100, ∞) Invalid
				out.println("The points must be between 0-100.");
				letter_grade = "Invalid";
			}
			else if (point_grade >= 90) {     // [90,100] A
				letter_grade = "A";
//				out.printf("Points Grade: " + point_grade);
//				out.println("Letter Grade: A");
			}
			else if (point_grade >= 80) {    // [80,90)  B
				letter_grade = "B";
//				out.printf("Points Grade: " + point_grade);
//				out.println("Letter Grade: B");	
			}
			else if (point_grade >= 70) {    // [70,80)  C
				letter_grade = "C";
//				out.printf("Points Grade: " + point_grade);
//				out.println("Letter Grade: C");	
			}
			else if (point_grade >= 65) {    // [65, 70)  D
				letter_grade = "D";
//				out.printf("Points Grade: " + point_grade);
//				out.println("Letter Grade: D");	
			}
			else if (point_grade < 65) {    // [0,65)  F
				letter_grade = "F";
//				out.printf("Points Grade: " + point_grade);
//				out.println("Letter Grade: F");	
			}
			out.printf("Points Grade: " + point_grade + "\n");
			out.printf("Letter Grade: " + letter_grade + "\n");
			
		}
		else {      // Invalid data type
			out.println("Not points! Please enter a number between 0 - 100.");
		}
		
		// Close the input stream and end the program
		in.close();
		out.println("\nThank you for using GPA Converter System. \nGoodbye!");
	}
}
