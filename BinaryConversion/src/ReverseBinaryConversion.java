import java.util.Scanner;

public class ReverseBinaryConversion {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final String PROMPT = "Enter a positive integer: ";
		Integer inputInteger = 0;
		
		System.out.print(PROMPT);
		inputInteger = scnr.nextInt();
		while (inputInteger > 0) {
			int remainder;
			int divisor = inputInteger;
			int resultTemp = inputInteger;
			while (divisor != 1) {
				divisor = resultTemp / 2;
				remainder = resultTemp % 2;
				resultTemp = divisor;
				System.out.print(remainder);
			}
			
			if (divisor == 1) {
				remainder = 1;
				System.out.print(remainder);
			}
			System.out.println();
			// Continuous prompt user input
			System.out.print(PROMPT);
			inputInteger = scnr.nextInt();
		}
		scnr.close();
		
	}
}
