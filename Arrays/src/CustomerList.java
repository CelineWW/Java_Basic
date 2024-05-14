import java.util.Scanner;

public class CustomerList {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements; 
      int i;
      
      numElements = scnr.nextInt();
      int[] customerNums = new int[numElements];
      
      for (i = 0; i < numElements; ++i) {
         customerNums[i] = scnr.nextInt();
      }

		System.out.print("Array contents: ");
		for (i = 0; i < customerNums.length; ++i) {
			System.out.print(customerNums[i] + " ");
		}
		System.out.println();
   }
}