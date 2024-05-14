import java.util.Scanner;

public class LeastCommonMultiple {

   // Method prompts user to enter positive non-zero number
   public static int promptForPositiveNumber(Scanner scnr) {
      int userNum;

      userNum = 0;

      while (userNum <= 0) {
         System.out.println("Enter a positive number (>0): ");
         userNum = scnr.nextInt();

         if (userNum <= 0) {
            System.out.println("Invalid number.");
         }
      }

      return userNum;
   }

   // Method returns greatest common divisor of two inputs
   public static int findGCD(int aVal, int bVal) {
      int numA;
      int numB;

      numA = aVal;
      numB = bVal;

      while (numA != numB) { // Euclid's algorithm
         if (numB > numA) {
            numB = numB - numA;
         } else {
            numA = numA - numB;
         }
      }

      return numA;
   }

   // Method returns least common multiple of two inputs
   public static int findLCM(int aVal, int bVal) {
      int lcmVal;

      lcmVal = Math.abs(aVal * bVal) / findGCD(aVal, bVal);

      return lcmVal;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int usrNumA;
      int usrNumB;
      int lcmResult;

      System.out.println("Enter value for first input");
      usrNumA = promptForPositiveNumber(scnr);

      System.out.println("\nEnter value for second input");
      usrNumB = promptForPositiveNumber(scnr);

      lcmResult = findLCM(usrNumA, usrNumB);

      System.out.println("\nLeast common multiple of " + usrNumA
              + " and " + usrNumB + " is " + lcmResult);
   }
}