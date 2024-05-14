import java.util.Scanner;
import java.util.InputMismatchException;

public class PairsOfDancers {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numDancers;
      int triesLeft = 3;

      while (triesLeft > 0) {
			System.out.println("Tries left: " + triesLeft);

         try {
            numDancers = scnr.nextInt();
  
            if (numDancers % 2 != 0) {
               throw new Exception("Dancers cannot be paired");
            }
  
            triesLeft = 0;
            System.out.print("Valid input: ");
            System.out.println(numDancers + " dancers form " + (numDancers / 2) + " pairs");
         }

         catch (InputMismatchException e) {
            System.out.println("Bad input type: The PairsOfDancers program exits");
            triesLeft = 0;
         }

         catch (Exception e) {
            System.out.println(e.getMessage());
            triesLeft -= 1;
         }
      }
   }
}